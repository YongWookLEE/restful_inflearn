package com.example.restfulwebservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


/**
 * SecurityConfig.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.01.09
 */

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails user = User.withUsername("YongWook")
                .password("{noop}test1234")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}