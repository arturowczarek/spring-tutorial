package info.owczarek.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		context.registerShutdownHook();
		
		context.getBean("someBean");
		context.close();
	}
}