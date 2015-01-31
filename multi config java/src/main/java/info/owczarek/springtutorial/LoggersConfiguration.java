package info.owczarek.springtutorial;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.implementations.DateLogger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LoggersConfiguration {
	@Bean
	@Scope("singleton")
	public Logger logger() {
		return new DateLogger();
	}
}
