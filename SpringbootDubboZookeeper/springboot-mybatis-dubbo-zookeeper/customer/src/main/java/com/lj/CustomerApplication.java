package com.lj;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath:spring-dubbo.xml" })
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CustomerApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CustomerApplication.class, args);
		System.out.println("服务端启动成功！！！");
	}
}
