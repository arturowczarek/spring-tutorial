package info.owczarek.springtutorial;

import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"konfiguracja.xml");

		UsersRepository usersRepository = context.getBean(
				"repozytoriumUzytkownikow", UsersRepository.class);
		
		User janek = usersRepository.createUser("janek");
	}
}
