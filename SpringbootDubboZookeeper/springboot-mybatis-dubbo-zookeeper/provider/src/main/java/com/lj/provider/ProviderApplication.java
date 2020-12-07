package com.lj.provider;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ImportResource({ "classpath:spring-dubbo.xml" })
public class ProviderApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ProviderApplication.class, args);
		System.out.println("aaaaaa！！！");
	}
}
