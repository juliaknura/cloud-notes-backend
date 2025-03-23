package com.example.cloud_notes_backend.services;

import com.example.cloud_notes_backend.mock_db.ImageNoteStore;
import com.example.cloud_notes_backend.model.ImageNote;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;


@Service
public class ImageNotesService {

    public boolean addImage(MultipartFile file) {
        try {
            ImageNoteStore.images.add(new ImageNote(UUID.randomUUID(), file.getBytes(), ZonedDateTime.now()));
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public List<ImageNote> getAllImages() {
        return ImageNoteStore.images;
    }
}
