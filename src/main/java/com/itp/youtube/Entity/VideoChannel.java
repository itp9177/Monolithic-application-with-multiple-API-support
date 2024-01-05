package com.itp.youtube.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "video_channels")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VideoChannel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name="channel_name")
    private String channelName;

}
