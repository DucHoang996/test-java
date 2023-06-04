package test.example.test_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
//		ApplicationContext context = SpringApplication.run(TestProjectApplication.class, args);
//		UserRepository userRepository = context.getBean(UserRepository.class);
//		userRepository.findAllUser();
	}
}
