package info.owczarek.springtutorial.api;

import info.owczarek.springtutorial.domain.User;

public interface UsersRepository {
	User createUser(String name);
}
