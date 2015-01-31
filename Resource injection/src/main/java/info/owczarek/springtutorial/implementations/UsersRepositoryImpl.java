package info.owczarek.springtutorial.implementations;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;
import org.springframework.stereotype.Service;
import javax.annotation.*;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
	@Resource(name = "withDateLogger")
	private Logger logger;

	public User createUser(String name) {
		logger.log("Tworzenie użytkownika " + name);
		return new User(name);
	}

//	@Resource
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
