package inc.flide.docman;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import inc.flide.docman.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}

