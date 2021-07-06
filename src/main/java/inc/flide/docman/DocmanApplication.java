package inc.flide.docman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inc.flide.docman.entity.Client;
import inc.flide.docman.repository.ClientRepository;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DocmanApplication {

	@Autowired
	ClientRepository clientRepository;

	public static void main(String[] args) {
		SpringApplication.run(DocmanApplication.class, args);
	}

	@PostMapping("/client")
	public ResponseEntity<Client> createTutorial(@RequestBody Client client) {
		try {
			System.out.println("inside /client endpoint");
			//Client clientDao = clientRepository.save(new Client(client));
			Client clientDao = clientRepository.save(new Client(client.getFirstName(), client.getLastName(), client.getPanNumber(), client.getEmailAddress(), client.getDateOfBirth()));
			System.out.println("clientDao : " + clientDao.getId());
			return new ResponseEntity<>(clientDao, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
