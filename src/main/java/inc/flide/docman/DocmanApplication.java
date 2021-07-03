package inc.flide.docman;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import inc.flide.docman.entities.User;

@SpringBootApplication
public class DocmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocmanApplication.class, args);
	}


}
