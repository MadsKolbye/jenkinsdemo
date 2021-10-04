package mads.dogapi.controllers;

import mads.dogapi.models.Dog;
import mads.dogapi.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Annoterer at vi har at gøre med en Rest Controller
@RestController
public class Dogs {

    //Annoterer at vi gerne vil gøre os brug af vores Dog Repository, så vi kan tilgå dets interface's metoder.
    @Autowired
    DogRepository dogRepository;

    //To get the list of all the dogs
    @GetMapping("/dogs")
    public Iterable<Dog> getDogs(){
        return dogRepository.findAll();
    }

    //To get the specific information on a specific ID
    @GetMapping("/dogs/{dog_id}")
    public Dog getDogOnId(@PathVariable Long dog_id){
        return dogRepository.getById(dog_id);
    }

    //To create a new dog into the list
    @PostMapping("/dogs")
    public Dog createDog(@RequestBody Dog createDog){
        return dogRepository.save(createDog);
    }

    //To update on a specific dog on ID
    @PutMapping("/dogs/{dog_id}")
    public Dog updateDog(@PathVariable Long dog_id, @RequestBody Dog dogUpdate){
        dogUpdate.setDog_id(dog_id);
        return dogRepository.save(dogUpdate);
    }

    //To delete a specific dog on ID
    @DeleteMapping("/dogs/{dog_id}")
    public void deleteDog(@PathVariable Long dog_id){
        dogRepository.deleteById(dog_id);
    }
}
