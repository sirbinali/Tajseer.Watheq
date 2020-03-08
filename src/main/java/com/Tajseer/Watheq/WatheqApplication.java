package com.Tajseer.Watheq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.ControllerAdvice;


@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
}
)
public class WatheqApplication {

	public static void main(String[] args) {
		SpringApplication.run(WatheqApplication.class, args);
	}

}
