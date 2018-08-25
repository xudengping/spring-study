package xdp.test.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xdp.test.spring.annotation.service.IUserService;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		IUserService userService = (IUserService) context.getBean("userService");
		userService.save();
	}

}
