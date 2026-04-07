package com.spider.jobfinder.repository;

import com.spider.jobfinder.models.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
