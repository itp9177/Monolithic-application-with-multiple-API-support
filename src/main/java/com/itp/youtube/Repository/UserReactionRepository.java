package com.itp.youtube.Repository;

import com.itp.youtube.Entity.UserReaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserReactionRepository extends JpaRepository<UserReaction, UUID> {
}
