package com.example.graduationproject.Repository;

import com.example.graduationproject.Domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Integer> {

}
