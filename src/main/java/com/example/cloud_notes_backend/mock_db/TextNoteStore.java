package com.example.cloud_notes_backend.mock_db;

import com.example.cloud_notes_backend.model.TextNote;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class TextNoteStore {
    public static ArrayList<TextNote> notes = new ArrayList<TextNote>() {{
        add(new TextNote(UUID.randomUUID(), "This is the first text note", ZonedDateTime.now()));
        add(new TextNote(UUID.randomUUID(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do " +
                "eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
                "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum", ZonedDateTime.now()));
        add(new TextNote(UUID.randomUUID(), "third note",ZonedDateTime.now()));
    }};
}
