package dio_aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

import dio_aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();

        user.setName("Pedro");
        user.setPassword("123456");

        repository.save(user);

        for(dio_aula.model.User u: repository.findAll()){
            System.out.println(u);
        }
    }

}
