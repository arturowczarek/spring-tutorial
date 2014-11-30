package info.owczarek.springtutorial.implementations;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;

	public UsersRepositoryImpl(Logger logger, String localization, String dbName) {
		this.logger = logger;
		logger.log("Lokalizacja repozytorium: " + localization + "/" + dbName);
	}

	public User createUser(String name) {
		logger.log("Tworzenie użytkownika " + name);
		return new User(name);
	}
}
