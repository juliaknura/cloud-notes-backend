package com.example.cloud_notes_backend.controllers;

import com.example.cloud_notes_backend.dto.NoteDto;
import com.example.cloud_notes_backend.model.TextNote;
import com.example.cloud_notes_backend.services.TextNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TextNotesController {

    private final TextNotesService service;

    @Autowired
    public TextNotesController(TextNotesService service) {
        this.service = service;
    }

    @PostMapping("post/note")
    public ResponseEntity<String> postNote(@RequestBody NoteDto note) {
        if (service.addTextNote(note.getNote())) {
            return ResponseEntity.ok("Note posted successfully");
        } else {
            return new ResponseEntity<>("Failed to load note - length exceeded max", HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("get/notes")
    public ResponseEntity<List<TextNote>> getAllNotes() {
        return ResponseEntity.ok(service.getAllNotes());
    }


}
