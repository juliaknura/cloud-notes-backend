package com.example.cloud_notes_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class ImageNote {
    private UUID id;
    private byte[] imageData;
    private ZonedDateTime timestamp;
}
