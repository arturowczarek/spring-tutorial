package info.owczarek.springtutorial;

public class User {
	private String name;
	private int age;
	
	private User() {
	}
	
	public static User getInstance(String name, int age) {
		User user = new User();
		user.name = name;
		user.age = age;
		return user;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
