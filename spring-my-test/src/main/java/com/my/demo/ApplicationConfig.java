package com.my.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author:hxd
 * @date:2020/7/12
 */
@Configuration
//@ComponentScan("com.my.demo")
public class ApplicationConfig {
	@Bean
	public HellofService hellofService() {
		return new HellofService();
	}
}
