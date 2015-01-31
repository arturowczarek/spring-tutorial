package info.owczarek.springtutorial.implementations;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;

	public User createUser(String name) {
		logger.log("Tworzenie użytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
