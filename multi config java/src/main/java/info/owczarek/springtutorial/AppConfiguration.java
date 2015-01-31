package info.owczarek.springtutorial;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.implementations.DateLogger;
import info.owczarek.springtutorial.implementations.UsersRepositoryImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({LoggersConfiguration.class, RepositoriesConfiguration.class})
public class AppConfiguration {
	
	
	
}
