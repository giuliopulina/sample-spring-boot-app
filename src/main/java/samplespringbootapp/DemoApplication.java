package samplespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sample.Library;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Library.test();
		SpringApplication.run(DemoApplication.class, args);
	}

}
