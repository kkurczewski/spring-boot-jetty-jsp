package com.howtodoinjava.app.controller;

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ServletConfiguration {

    @Bean
    @Profile("tomcat")
    public ServletWebServerFactory tomcatServlet() {
        return new TomcatServletWebServerFactory();
    }

    @Bean
    @Profile("jetty")
    public ServletWebServerFactory jettyServlet() {
        return new JettyServletWebServerFactory();
    }
}
