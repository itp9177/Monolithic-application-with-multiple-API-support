package com.itp.youtube.Entity;

import com.itp.youtube.Util.Enum.ThumbnailRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "thumbnail_set")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VideoThumbnail {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name="url")
    private String url;

    @Column(name="role")
    @Enumerated(EnumType.STRING)
    private ThumbnailRole role;
}
