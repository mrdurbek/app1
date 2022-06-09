package com.spring.architecture1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.architecture1.entity.Posts;

public interface PostRepository extends JpaRepository<Posts, Integer> {

}
