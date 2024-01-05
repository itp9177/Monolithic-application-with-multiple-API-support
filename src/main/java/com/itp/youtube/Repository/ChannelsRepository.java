package com.itp.youtube.Repository;

import com.itp.youtube.Entity.VideoChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.UUID;

@EnableJpaRepositories
public interface ChannelsRepository extends JpaRepository<VideoChannel, UUID> {
}
