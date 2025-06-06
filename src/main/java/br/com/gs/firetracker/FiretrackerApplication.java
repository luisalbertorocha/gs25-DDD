package br.com.gs.firetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FiretrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiretrackerApplication.class, args);
	}

}
