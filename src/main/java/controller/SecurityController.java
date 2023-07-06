package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping("welcome")
    ResponseEntity<String>welcome(){
        return ResponseEntity.ok("welcome");
    }
}
