package kea.mads.scripttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScriptTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScriptTestApplication.class, args);
        System.out.println("Mit script virker!");
    }

}
