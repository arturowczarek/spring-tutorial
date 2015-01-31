package info.owczarek.springtutorial;

import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
		
		UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);
		User janek = usersRepository.createUser("janek");
		System.out.println("Użytkownik " + janek.getName() + " został utworzony");
	}
}