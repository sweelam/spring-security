package com.sweelam.securitytesting.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/secure/users")
    public String getIt() {
        return "Done";
    }


    @GetMapping("/public/users")
    public String getItPublicly() {
        return "Done Publicly";
    }
}
