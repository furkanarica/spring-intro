package iocDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IProductService productService = context.getBean("service", IProductService.class);
		productService.add();
		context.close();
	}
}
