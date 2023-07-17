package com.example.cherrypickserver.article.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
  Optional<Article> findByIdAndIsEnable(Long articleIdx, Boolean status);
}
