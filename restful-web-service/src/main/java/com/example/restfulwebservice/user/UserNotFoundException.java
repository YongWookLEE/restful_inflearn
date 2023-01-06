package com.example.restfulwebservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * UserNotFoundException.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.01.05
 */

// 2XX -> OK
// 4XX -> client
// 5XX -> Server
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
