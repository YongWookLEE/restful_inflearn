package com.example.restfulwebservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.01.09
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
