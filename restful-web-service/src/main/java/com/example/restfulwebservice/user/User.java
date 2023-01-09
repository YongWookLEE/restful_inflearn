package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * User.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.01.04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"ssn"})
@JsonFilter("UserInfo")
public class User {
    private Integer id;
    @Size(min=2, message = "Name은 2글자 이상 입력해 주세요.")
    private String name; 
    @Past
    private Date joinDate;
//    @JsonIgnore
    private String password;
//    @JsonIgnore
    private String ssn;
}
                                    