package info.owczarek.springtutorial;

import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean {
	public void init() {
		System.out.println("Inicjalizacja beana");
	}
	
	public void checkIsWorking() {
		System.out.println("Działam!");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Odpalamy afterPropertiesSet!");
	}
}
