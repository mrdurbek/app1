package com.spring.architecture1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.architecture1.entity.Posts;
import com.spring.architecture1.repository.PostRepository;

@RestController
@RequestMapping("/api/post")
public class PostController {
	
	@Autowired
	PostRepository postRepository;
	
	@GetMapping
	public ResponseEntity<?> getPost(){
		return ResponseEntity.ok(postRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<?> addPost(@RequestBody String text){
		Posts post = new Posts();
		post.setText(text);
		postRepository.save(post);
		return ResponseEntity.ok("Succesfully");
	}
	
}
