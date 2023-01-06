package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * HelloWorldController.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.01.04
 */

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private MessageSource messageSource;
    private AcceptHeaderResolver resolver;

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable(value = "name") String name){
        return new HelloWorldBean(String.format("Hello World, %s",name));
    }


    // 이거 안됨
    @GetMapping("/hello-world-internationalized")
    public String helloWorldInternationalized(HttpServletRequest request){
        String acceptLanguage = request.getHeader("Accept-Language");
        System.out.println(acceptLanguage);
        Locale locale = resolver.resolveLocale(request);
        return messageSource.getMessage("greeting.message", null, locale);
    }
}
