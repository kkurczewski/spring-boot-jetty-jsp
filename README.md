# Spring Boot + JSP + Tomcat/Jetty

Modernized example from [How to do in Java](https://howtodoinjava.com/spring-boot/spring-boot-jsp-view-example/).

## Build & run

```
mvn clean package
java -jar -Dspring.profiles.active=jetty ./target/spring-boot-demo-1.0.0.war 
```

And visit http://localhost:8080/.

### Notes

Key classes are `DispatcherServletAutoConfiguration` and `InternalResourceViewResolver`, both configured
by `@SpringBootApplication`.

In case of Jetty `tomcat-embed-core` is needed to resolve JSP view correctly but it also triggers Tomcat as a default
container therefore explicit `ServletWebServerFactory` has to be defined.

There is also [possibility](https://dzone.com/articles/spring-boot-with-jsps-in-executable-jars-1) to get rid of webapp
folder, although verbose one and seems broken now.
