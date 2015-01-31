package info.owczarek.springtutorial.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired(required = false)
	private Logger logger;

	public User createUser(String name) {
		if (logger != null) {
			logger.log("Tworzenie użytkownika " + name);
		}
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
