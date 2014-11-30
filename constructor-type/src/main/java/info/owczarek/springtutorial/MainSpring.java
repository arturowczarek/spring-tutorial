package info.owczarek.springtutorial;

import info.owczarek.springtutorial.implementations.SomeBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
		SomeBean bean = context.getBean("someBean", SomeBean.class);
	}
}
