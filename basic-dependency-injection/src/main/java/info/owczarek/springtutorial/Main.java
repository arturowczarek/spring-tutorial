package info.owczarek.springtutorial;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;
import info.owczarek.springtutorial.implementations.LoggerImpl;
import info.owczarek.springtutorial.implementations.UsersRepositoryImpl;

public class Main {
	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		
		User user = usersRepository.createUser("janek");
	}
}
