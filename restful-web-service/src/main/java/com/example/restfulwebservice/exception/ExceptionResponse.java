package com.example.restfulwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ExceptionResponse.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.01.05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;
}
