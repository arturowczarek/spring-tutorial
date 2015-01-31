package info.owczarek.springtutorial.implementations;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired(required = false)
	private Logger logger;

	@Value("${database.host}")
	private String host;
	@Value("${database.port}")
	private int port;
	@Value("${database.name}")
	private String database;
	@Value("#{systemProperties['database.user']}")
	private String user;
	@Value("#{systemProperties['database.password']}")
	private String password;

	public User createUser(String name) {
		if (logger != null) {
			logger.log("Dodawanie użytkownika " + name + " do bazy " + host
					+ ":" + port + "/" + database
					+ " korzystając z użytkownika " + user + " i hasła "
					+ password);
		}
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
