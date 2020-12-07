package com.lj.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import lj.common.domain.Order;
import lj.common.service.OrderService;

@Service(version = "1.0.0")
public class OrderImpl implements OrderService {

	@Override
	public Order getOrders(int id) {
		Order order = new Order();
		order.setAddress("北京市大兴区王立庄村委会");
		order.setId(id);
		order.setOrderName("武林外传");
		return order;
	}

}
