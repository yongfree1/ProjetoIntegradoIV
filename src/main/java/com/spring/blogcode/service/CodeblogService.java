package com.spring.blogcode.service;

import com.spring.blogcode.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
