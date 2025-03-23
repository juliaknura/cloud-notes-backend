package com.example.cloud_notes_backend.controllers;

import com.example.cloud_notes_backend.model.ImageNote;
import com.example.cloud_notes_backend.services.ImageNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ImageNotesController {

    private final ImageNotesService service;

    @Autowired
    public ImageNotesController(ImageNotesService service) {
        this.service = service;
    }

    @PostMapping("post/image")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        if (service.addImage(file)) {
            return ResponseEntity.ok("Image uploaded successfully");
        } else {
            return new ResponseEntity<>("Failed to upload image", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("get/images")
    public ResponseEntity<List<ImageNote>> getAllImages() {
        return ResponseEntity.ok(service.getAllImages());
    }

}
