package com.example.cloud_notes_backend.services;

import com.example.cloud_notes_backend.mock_db.TextNoteStore;
import com.example.cloud_notes_backend.model.TextNote;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TextNotesService {

    private final int MAX_TEXT_LENGTH = 500;
    public boolean addTextNote(String text) {
        if(text.length() > MAX_TEXT_LENGTH)
        {
            return false;
        }
        TextNoteStore.notes.add(new TextNote(UUID.randomUUID(), text, ZonedDateTime.now()));
        return true;
    }

    public List<TextNote> getAllNotes() {
        return TextNoteStore.notes;
    }
}
