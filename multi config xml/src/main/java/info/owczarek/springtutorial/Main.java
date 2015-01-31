package info.owczarek.springtutorial;

import info.owczarek.springtutorial.api.UsersRepository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("repositories.xml", "loggers.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.getBean("usersRepository", UsersRepository.class).createUser("janek");
	}
}