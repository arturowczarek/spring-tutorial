package info.owczarek.springtutorial;

import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean {
	public void afterPropertiesSet() throws Exception {
		System.out.println("inicjalizacja");
	}
}
