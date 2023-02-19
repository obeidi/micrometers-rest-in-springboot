package ahmad.micrometers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootMicrometersDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicrometersDemoApplication.class, args);
	}

}
