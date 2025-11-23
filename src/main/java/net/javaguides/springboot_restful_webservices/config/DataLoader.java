package net.javaguides.springboot_restful_webservices.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import net.javaguides.springboot_restful_webservices.entity.User;
import net.javaguides.springboot_restful_webservices.repository.UserRepository;

@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // Check if database is empty
        if (userRepository.count() == 0) {
            // Load sample data
            User user1 = new User();
            user1.setFirstName("John");
            user1.setLastName("Doe");
            user1.setEmail("john.doe@example.com");
            userRepository.save(user1);

            User user2 = new User();
            user2.setFirstName("Jane");
            user2.setLastName("Smith");
            user2.setEmail("jane.smith@example.com");
            userRepository.save(user2);

            User user3 = new User();
            user3.setFirstName("Mike");
            user3.setLastName("Johnson");
            user3.setEmail("mike.johnson@example.com");
            userRepository.save(user3);

            User user4 = new User();
            user4.setFirstName("Sarah");
            user4.setLastName("Williams");
            user4.setEmail("sarah.williams@example.com");
            userRepository.save(user4);

            User user5 = new User();
            user5.setFirstName("David");
            user5.setLastName("Brown");
            user5.setEmail("david.brown@example.com");
            userRepository.save(user5);

            System.out.println("✅ Sample data loaded: 5 users created");
        }
    }
}
