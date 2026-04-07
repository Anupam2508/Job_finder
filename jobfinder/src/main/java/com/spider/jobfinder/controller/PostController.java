package com.spider.jobfinder.controller;

import com.spider.jobfinder.models.Post;
import com.spider.jobfinder.repository.PostRepository;
import com.spider.jobfinder.repository.SearchRepository;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepository searchrepo;
    @Hidden
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }
    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }
    @PostMapping("/post")
    public Post addPosts(@RequestBody Post post){
        return repo.save(post);
    }
    @GetMapping("/posts/{text}")
    public List<Post> searchPost(@PathVariable String text){
        return searchrepo.findByText(text);
    }

}
