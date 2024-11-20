package com.example.springSecurityAdmin.User.Login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
 @Configuration
 //This annotation tells spring to enable web security feature in the application
  @EnableWebSecurity

public class SecurityConfig {
//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//
//         http.csrf().disable()
//                 .authorizeHttpRequests((authorize)->{
//                     authorize.requestMatchers("api/v1/**").permitAll();
//
//                     authorize.anyRequest().authenticated();
//                 }).httpBasic(Customizer.withDefaults());
//         return http.build();
//     }
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> {
              ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.anyRequest()).authenticated();
        });
//        http.sessionManagement(session
//                -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//the line of code above stateless does away with cookies(when you inspect
// and go to the network tab) making our  API STATELESS
     http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        return (SecurityFilterChain)http.build();

    }
}
