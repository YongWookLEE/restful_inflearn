package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

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
@Builder
@JsonIgnoreProperties(value = {"ssn"})
@ApiModel(description = "사용자 상세 정보를 위한 도메인 객체")
public class User {
    private Integer id;
    @Size(min=2, message = "Name은 2글자 이상 입력해 주세요.")
    @ApiModelProperty(notes = "사용자 이름을 입력해 주세요.")
    private String name; 
    @Past
    @ApiModelProperty(notes = "사용자 등록일을 입력해 주세요.")
    private Date joinDate;
//    @JsonIgnore
    @ApiModelProperty(notes = "사용자 비밀번호를 입력해 주세요.")
    private String password;
//    @JsonIgnore
@ApiModelProperty(notes = "사용자 주민번호를 입력해 주세요.")
    private String ssn;
}
                                    