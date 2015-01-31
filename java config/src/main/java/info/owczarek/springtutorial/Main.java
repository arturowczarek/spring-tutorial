package info.owczarek.springtutorial;

import info.owczarek.springtutorial.api.UsersRepository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);
		usersRepository.createUser("Dawid");
	}
}