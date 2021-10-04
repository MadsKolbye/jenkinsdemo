package edu.kea.paintings.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.kea.paintings.models.Painting;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Paintings {

    private ArrayList<Painting> paintings = new ArrayList<Painting>();

    @GetMapping("/paintings")
    public ArrayList<Painting> getPaintings(){
        return paintings;
    }

    @GetMapping("paintings/{paintingID}")
    public Painting getPaintingsOnId(@PathVariable int paintingID){
        System.out.println(paintingID);
        return paintings.get(paintingID);
    }

    @PutMapping("/paintings/{paintingID}")
    public Painting updatePaintingOnID(@PathVariable int paintingID, @RequestBody Painting newPainting){
        paintings.set(paintingID, newPainting);
        return newPainting;
    }

    @PatchMapping("/paintings/{id}")
    public Painting patchPainting(@PathVariable int id, @RequestBody String body) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Painting newPainting = mapper.readValue(body, Painting.class);
            paintings.set(id, newPainting);
            return newPainting;
        } catch (JsonProcessingException error) {
            System.out.println(error);
            Painting unknownPainting = new Painting("Unknown");
            paintings.set(id, unknownPainting);
            return unknownPainting;
        }
    }

    @PostMapping("/paintings")
    public Painting addPainting(@RequestBody Painting painting){
        paintings.add(painting);
        return painting;
    }


    @DeleteMapping("paintings/{paintingID}")
    public Painting deletePaintingOnId(@PathVariable int paintingID){
        return paintings.remove(paintingID);
    }


}
