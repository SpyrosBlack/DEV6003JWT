package com.nyc.jwt.controllers;


import com.nyc.jwt.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @GetMapping("/getAllPosts")
    public List<Post> getAll() {
        return List.of(new Post("New idea for Project", "Tom", "I have a new idea for project"),
                        new Post("Test post", "admin", "This is a test"));
    }

    @PostMapping("/inserpost")
    public Post insert(@RequestBody Post post) {

        return post;
    }

}
