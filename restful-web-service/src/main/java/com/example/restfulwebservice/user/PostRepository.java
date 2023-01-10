package com.example.restfulwebservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PostRepository.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.01.10
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
