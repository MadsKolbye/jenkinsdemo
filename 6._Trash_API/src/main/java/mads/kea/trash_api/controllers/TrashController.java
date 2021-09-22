package mads.kea.trash_api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
@RestController

public class TrashController {


    //GetMapping = Endpoint

    //Det her er en route på root ("/")
    @GetMapping("/")
    public String messageBack(){
        return "Hej!";
    }
    static String[] deadlySins ={"Greed", "Gluttony","Wrath", "Lust", "Envy", "Sloth", "Pride"};

    @GetMapping("/clock")
    public LocalDateTime clockMessage(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        //System.out.println(formatter.format(now));
        return now;
    }
    @GetMapping("/clock2")
    public Date clockMessage2(){
        return new Date();
    }


    @GetMapping("/sevendeadlysins/{sinNumber}")
    public String getADeadlySin(@PathVariable int sinNumber){
        try {
            return deadlySins[sinNumber];
        } catch (Exception error){
            System.out.println(error);
            return "No sin";
        }
    }
    @GetMapping("/trash")
    public String sendAnyTrash(@RequestParam String trash){

        return "Trash: " + trash;
    }

    @PostMapping("/rubbishbin")
    public String throwOut(@RequestBody String rubbish){
        System.out.println(rubbish);
        return "Everything went well...ish";
    }

}
