package edu.kea.paintings.controllers;


import edu.kea.paintings.models.Artist;
import edu.kea.paintings.repositories.ArtistRepository;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Artists {

    @Autowired
    ArtistRepository artists;

    @GetMapping("/artists")
    public Iterable<Artist> getArtists(){
        return artists.findAll();
    }

    @GetMapping("/artists/{artistid}")
    public Artist getArtistsOnId(@PathVariable Long artistid){
        return artists.findById(artistid).get();
    }

    @PostMapping("/artists")
    public Artist createArtist(@RequestBody Artist newArtist){
        return artists.save(newArtist);
    }

    @PutMapping("/artists/{artistid}")
    public String updateArtistOnId(@PathVariable Long artistid, @RequestBody Artist artistToUpdate){

        if(artists.existsById(artistid)) {
            artists.save(artistToUpdate);
            return "Artist was created";
        } else {
            return "Artist not found";
        }
        /*
        artistToUpdate.setId(artistid);
        artists.save(artistToUpdate);


        return artists.findById(artistid).map(foundArtist -> {
            System.out.println("foundArtist");
            foundArtist.setName(artistToUpdate.getName());
            foundArtist.setAge(artistToUpdate.getAge());
            foundArtist.setNationality(artistToUpdate.getNationality());
            foundArtist.setPrimaryStyle(artistToUpdate.getPrimaryStyle());
            foundArtist.setBirthDate(artistToUpdate.getBirthDate());
            foundArtist.setGender(artistToUpdate.getGender());
            artists.save(foundArtist);
            return "Artist updated";
        }).orElse("Artist not updated");
*/
    }

    @PatchMapping("/artists/{artistid}")
    public String patchArtistOnId(@PathVariable Long artistid, @RequestBody Artist artistToUpdate){
        return artists.findById(artistid).map(foundArtist -> {
            System.out.println("foundArtist");
            if(artistToUpdate.getName() != null) foundArtist.setName(artistToUpdate.getName());
            if(artistToUpdate.getAge() != 0) foundArtist.setAge(artistToUpdate.getAge());
            if(artistToUpdate.getNationality() != null) foundArtist.setNationality(artistToUpdate.getNationality());
            if(artistToUpdate.getPrimaryStyle() != null) foundArtist.setPrimaryStyle(artistToUpdate.getPrimaryStyle());
            if(artistToUpdate.getBirthDate() != null) foundArtist.setBirthDate(artistToUpdate.getBirthDate());
            if(artistToUpdate.getGender() != null) foundArtist.setGender(artistToUpdate.getGender());
            artists.save(foundArtist);
            return "Artist updated";
        }).orElse("Artist not updated");
    }

    @DeleteMapping("/artists/{artistid}")
    public void deleteArtistOnId(@PathVariable Long artistid){
        artists.deleteById(artistid);
    }

}
