
package com.offer.voucherpool.config;

import com.offer.voucherpool.model.Users;
import com.offer.voucherpool.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            userRepository.save(new Users(1, "Peter", "peter@123.com"));
            userRepository.save(new Users(2, "Sam", "sam@123.com"));
        };
    }

}