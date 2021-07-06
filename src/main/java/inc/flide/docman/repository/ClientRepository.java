package inc.flide.docman.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import inc.flide.docman.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {}

