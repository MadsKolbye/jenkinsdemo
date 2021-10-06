package edu.kea.paintings.controllers;

import edu.kea.paintings.models.Gallery;
import edu.kea.paintings.repositories.ArtistRepository;
import edu.kea.paintings.repositories.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Galleries {

    @Autowired
    GalleryRepository galleryRepository;

    @GetMapping("/galleries")
    public Iterable<Gallery> getGalleries(){
        return galleryRepository.findAll();
    }

    @GetMapping("/galleries/{gallery_id}")
    public Gallery getGalleryOnId(@PathVariable Long gallery_id){
        return galleryRepository.findById(gallery_id).get();
    }

    @PostMapping("/galleries")
    public Gallery createGallery(@RequestBody Gallery createGallery){
        return galleryRepository.save(createGallery);
    }

    @PutMapping("/galleries/{gallery_id}")
    public Gallery updateGalleryOnId(@PathVariable Long gallery_id, @RequestBody Gallery galleryUpdate){
        galleryUpdate.setGallery_id(gallery_id);
        return galleryRepository.save(galleryUpdate);
    }

    @DeleteMapping("/galleries/{gallery_id}")
    public void deleteGalleryOnId(@PathVariable Long gallery_id){
        galleryRepository.deleteById(gallery_id);
    }
}
