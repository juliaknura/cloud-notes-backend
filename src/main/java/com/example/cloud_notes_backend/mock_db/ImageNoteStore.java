package com.example.cloud_notes_backend.mock_db;

import com.example.cloud_notes_backend.model.ImageNote;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class ImageNoteStore {

    public static ArrayList<ImageNote> images = new ArrayList<ImageNote>() {{
        add(new ImageNote(UUID.randomUUID(), readPic(), ZonedDateTime.now()));
    }};

    private static byte[] readPic() {
        try {
            File file = new File("src/main/resources/duckie.png");
            FileInputStream fstream = new FileInputStream(file);
            byte[] arr = new byte[(int) file.length()];
            fstream.read(arr);
            fstream.close();
            return arr;
        } catch (IOException e) {
            System.out.println("Failed reading file: " + e.getMessage());
            return new byte[0];
        }
    }
}
