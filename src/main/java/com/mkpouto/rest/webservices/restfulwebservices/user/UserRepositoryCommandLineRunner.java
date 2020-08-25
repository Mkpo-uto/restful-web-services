package com.mkpouto.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
       User user = new User(100001,"Mkpo-uto",new Date());
       userRepository.save(user);
       userRepository.save(new User(100002, "Edima",new Date()));
       userRepository.save(new User(100003, "Etimbuk",new Date()));
    }
}
