package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
<<<<<<< HEAD:demo/src/main/java/com/example/demo/HomeController.java
public class HomeController {
=======
public class HelloController {
>>>>>>> a40e93ba4a41a703242d7bac09bab7ccc9405281:demo/src/main/java/com/example/demo/HelloController.java

public static void main(String[] args) {
SpringApplication.run(HomeController.class, args);
}

@GetMapping("/hello")
public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
return String.format("Hello %s!", name);
}
}
