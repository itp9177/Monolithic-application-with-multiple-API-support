package com.itp.youtube.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "user_reactions")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserReaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

}
