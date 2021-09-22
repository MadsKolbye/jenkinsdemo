package HandMaven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandMavenController {
    @GetMapping("/")
    public String aboutMessage(){
        return "About this website...";
    }
}
