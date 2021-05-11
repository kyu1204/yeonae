package com.jm.yeonae.repository;

import com.jm.yeonae.domain.YeonaePost;

import java.util.List;
import java.util.Optional;

public interface YeonaePostRepository {
    YeonaePost save(YeonaePost yeonaePost);
    Optional<YeonaePost> findById(Long id);
    Optional<YeonaePost> findByTitle(String title);
    Optional<YeonaePost> findByTAuthor(String author);
    List<YeonaePost> findAll();
}
