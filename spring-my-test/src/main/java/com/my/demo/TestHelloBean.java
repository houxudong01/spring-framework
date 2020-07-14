package com.my.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author:hxd
 * @date:2020/7/12
 */
public class TestHelloBean {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		HellofService hellofService = context.getBean(HellofService.class);
		hellofService.sayHello();
	}
}
