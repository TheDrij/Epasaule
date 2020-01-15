package Planets;


import org.springframework.data.repository.CrudRepository;
import Planets.User;

public interface UserRepository extends CrudRepository<User,Integer> {
}
