package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So the Spring container can process the class and generate Spring Beans.

 */
@Configuration
@ComponentScan("com.example.bean")
public class ProjectConfig {


}
