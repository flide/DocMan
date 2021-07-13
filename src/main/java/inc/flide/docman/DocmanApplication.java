package inc.flide.docman;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
			Client clientDao = clientRepository.save(new Client(client));
			return new ResponseEntity<>(clientDao, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/client")
	public ResponseEntity<List<Client>> getAllClients() {
		try {
			System.out.println("line1");
			List<Client> clients = new ArrayList<Client>();
			System.out.println("line2");
			clientRepository.findAll().forEach(clients::add);
			System.out.println("line3");
			return new ResponseEntity<>(clients, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println("error : " + e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
