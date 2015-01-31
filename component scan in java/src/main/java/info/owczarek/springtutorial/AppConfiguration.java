package info.owczarek.springtutorial;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.implementations.DateLogger;
import info.owczarek.springtutorial.implementations.UsersRepositoryImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "info.owczarek.springtutorial.implementations")
public class AppConfiguration {
//	@Bean
//	public Logger logger() {
//		return new DateLogger();
//	}
//	
//	@Bean
//	public UsersRepository usersRepository() {
//		UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
//		usersRepository.setLogger(logger());
//		return usersRepository;
//	}
}
