package es.dbiosag.command;

import es.dbiosag.command.infrasturcture.repository.PhoneRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class DemoCommandWithKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCommandWithKafkaApplication.class, args);
	}

}
