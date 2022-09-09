package com.howtodoinjava.app.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan
@ImportAutoConfiguration(DispatcherServletAutoConfiguration.class)
public class Application {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(Application.class, args);

        List.of(ctx.getBeanFactory().getBeanDefinitionNames()).forEach(
            System.out::println
        );
    }
}