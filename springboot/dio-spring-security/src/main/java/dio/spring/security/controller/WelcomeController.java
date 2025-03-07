package dio.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to my Springboot Web Api";
    }
    @GetMapping("/users")
    public String Users(){
        return "Authorized user";
    }
    @GetMapping("/managers")
    public String managers(){
        return "Authorized manager";
    }
}
