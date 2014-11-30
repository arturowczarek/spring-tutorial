package info.owczarek.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Application application = context.getBean("aplikacja", Application.class);
		System.out.println(application.getUsersRepository().exists("janek"));
		System.out.println(application.getDictionaryRepository().getMapValue());
	}
}
