package mads.kea.trash_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupermarioController {

    @GetMapping("/supermario/characters")
    public String superMarioCharacter(){
        return "Mario";
    }

    @GetMapping("/supermario/bowser")
    public String bowserCharacter(){
        SuperMarioCharacter spmc = new SuperMarioCharacter();
        return spmc.marioChar();
    }

}
