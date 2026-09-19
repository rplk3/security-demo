package lk.sliit.it3130.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/public")
    public String publicPage() {
        return "Anyone can access this page.";
    }

    @GetMapping("/student")
    public String studentPage() {
        return "Welcome Student!";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Welcome Administrator!";
    }

    @GetMapping("/lecturer")
    public String lecturerPage() {
        return "Welcome Lecturer!";
}
}