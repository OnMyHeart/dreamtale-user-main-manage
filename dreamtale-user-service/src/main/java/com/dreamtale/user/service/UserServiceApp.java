package com.dreamtale.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
// 组件扫描。需要扫描加载common等其他依赖包中的组件
@ComponentScan(basePackages = { "com.dreamtale" })
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ServletComponentScan(basePackages = { "com.dreamtale" })
public class UserServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApp.class, args);
	}
}
