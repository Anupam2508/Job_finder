package com.spider.jobfinder.repository;

import com.spider.jobfinder.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
