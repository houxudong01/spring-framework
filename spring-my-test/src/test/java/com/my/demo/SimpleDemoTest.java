package com.my.demo;

import org.junit.Test;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:hxd
 * @date:2020/7/12
 */
@Configuration
public class SimpleDemoTest {
	@Test
	public void test() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-student.xml");
		Teacher teacher = (Teacher) ac.getBean("teacher");
		System.out.println(teacher);
	}

}
