package com.itp.youtube.Entity;

import com.itp.youtube.Util.Enum.VideoStatus;
import com.itp.youtube.Util.Enum.VideoVisibility;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.UUID;

@Table(name = "video")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "title")
    private String videoTitle;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private VideoStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "visibility")
    private VideoVisibility videovisibility;

    @Column(name = "url")
    private String url;
}
