package info.owczarek.springtutorial;

public class Component1 {
	private UsersRepository usersRepository;

	public UsersRepository getUsersRepository() {
		return usersRepository;
	}

	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
}
