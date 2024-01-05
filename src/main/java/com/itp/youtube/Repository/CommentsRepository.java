package com.itp.youtube.Repository;

import com.itp.youtube.Entity.UserComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentsRepository extends JpaRepository<UserComment, UUID> {
}
