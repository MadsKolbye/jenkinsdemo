package mads.kea.trash_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

public class PokemonController {

    @GetMapping("/pokemon/go")
    public Boolean pokemonGo(){
        return true;
    }
    ArrayList <String> pokemons = new ArrayList<>();

    @GetMapping("/pokemon")
    public ArrayList<String> pokemonList(){
        pokemons.add("Pikachu");
        pokemons.add("Charmander");
        pokemons.add("Mew");
        pokemons.add("Nidoking");
        pokemons.add("Mewto");
        return pokemons;
    }

    @GetMapping("/sins")
    public String deadlySins(){
        Random random = new Random();
        int ranNumber = random.nextInt(7) +1;
        String sin = "";
        switch(ranNumber){
            case 1:
                sin = "Test 1";
                break;
            case 2:
                sin = "Test 2";
                break;
            case 3:
                sin = "Test 3";
                break;
            case 4:
                sin = "Test 4";
                break;
            case 5:
                sin = "Test 5";
                break;
            case 6:
                sin = "Test 6";
                break;
            case 7:
                sin = "Test7";
                break;

        }

        return sin;
    }


}
