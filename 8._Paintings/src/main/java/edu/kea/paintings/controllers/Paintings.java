package edu.kea.paintings.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.kea.paintings.models.Artist;
import edu.kea.paintings.models.Gallery;
import edu.kea.paintings.models.Painting;
import edu.kea.paintings.repositories.PaintingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Paintings {

    private ArrayList<Painting> paintings = new ArrayList<Painting>();
    @Autowired
    PaintingRepository paintingRepository;

    @GetMapping("/paintings")
    public Iterable<Painting> getPaintings(){
        return paintingRepository.findAll();
    }

    @GetMapping("paintings/{paintingID}")
    public Painting getPaintingsOnId(@PathVariable Long paintingID){
        System.out.println(paintingID);
        return paintingRepository.findById(paintingID).get();
    }

    @PostMapping("/paintings")
    public Painting createPainting(@RequestBody Painting createPainting){
        return paintingRepository.save(createPainting);
    }

    @PutMapping("/paintings/{painting_id}")
    public Painting updatePaintingOnId(@PathVariable Long painting_id, @RequestBody Painting paintingUpdate){
        paintingUpdate.setPainting_id(painting_id);
        return paintingRepository.save(paintingUpdate);
    }
/*
    @PatchMapping("/paintings/{painting_id}")
    public String patchPaintingOnId(@PathVariable Long painting_id, @RequestBody Painting paintingToUpdate){
        return paintings.findById(painting_id).map(foundPainting -> {
            System.out.println("foundArtist");
            if(paintingToUpdate.getArtist() != null) foundPainting.setArtist(paintingToUpdate.getArtist());
            if(paintingToUpdate.getAge() != 0) foundArtist.setAge(artistToUpdate.getAge());
            if(paintingToUpdate.getNationality() != null) foundArtist.setNationality(artistToUpdate.getNationality());
            if(paintingToUpdate.getPrimaryStyle() != null) foundArtist.setPrimaryStyle(artistToUpdate.getPrimaryStyle());
            if(paintingToUpdate.getBirthDate() != null) foundArtist.setBirthDate(artistToUpdate.getBirthDate());
            if(paintingToUpdate.getGender() != null) foundArtist.setGender(artistToUpdate.getGender());
            paintings.save(foundPainting);
            return "Artist updated";
        }).orElse("Artist not updated");
    }
*/
    @DeleteMapping("/painting/{painting_id}")
    public void deletePaintingOnId(@PathVariable Long painting_id){
        paintingRepository.deleteById(painting_id);
    }
}
