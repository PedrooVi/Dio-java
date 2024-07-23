package dio_aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio_aula.model.User;

public interface  UserRepository extends  JpaRepository<User, Integer>{

    void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);

}
