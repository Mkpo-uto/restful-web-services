package com.mkpouto.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


public class PostRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    private PostRepository postRepository;



    @Override
    public void run(String... args) throws Exception {

       // Post post = new Post(1,"My first post",userRepository.findById(1));
       // postRepository.save(new Post(1,"My first post",userRepository.findById(1));
      //  postRepository.save(new Post(2,"My second post",userRepository.findById(2)));
    }
}
