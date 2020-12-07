package com.lj.customer.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import lj.common.domain.Order;
import lj.common.domain.User;
import lj.common.service.OrderService;
import lj.common.service.UserService;

@RestController
public class UserController {
	@Resource
	@Reference(version = "1.0.0")
	private UserService userService;

	@GetMapping("/getUser")
	public User user() {
		System.out.println("进来了！！！！！！！！！！！！！！！！");
		return userService.findUser();
	}

	@Resource
	@Reference(version = "1.0.0")
	private OrderService orderService;

	@RequestMapping("/getOrder")
	public Order getOrder() {
		System.out.println("进来了！！！！！！！！！！！！！！！！");
		return orderService.getOrders(3);
	}

}
