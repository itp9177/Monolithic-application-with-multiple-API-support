package com.itp.youtube.Repository;

import com.itp.youtube.Entity.VideoThumbnail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ThumbnailRepository extends JpaRepository<VideoThumbnail, UUID> {


}