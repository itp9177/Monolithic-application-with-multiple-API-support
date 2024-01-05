package com.itp.youtube.Repository;

import com.itp.youtube.Entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<MyUser, UUID> {


}