package info.owczarek.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		CountersUser bean = context.getBean("countersUser", CountersUser.class);
		
		System.out.println("bean.getPrototypeCounter1().getCounter()");
		System.out.println(bean.getPrototypeCounter1().getCounter());
		System.out.println(bean.getPrototypeCounter1().getCounter());
		System.out.println("bean.getPrototypeCounter2().getCounter()");
		System.out.println(bean.getPrototypeCounter2().getCounter());
		System.out.println(bean.getPrototypeCounter2().getCounter());
		System.out.println("bean.getSingletonCounter1().getCounter()");
		System.out.println(bean.getSingletonCounter1().getCounter());
		System.out.println(bean.getSingletonCounter1().getCounter());
		System.out.println("bean.getSingletonCounter2().getCounter()");
		System.out.println(bean.getSingletonCounter2().getCounter());
		System.out.println(bean.getSingletonCounter2().getCounter());
	}
}
