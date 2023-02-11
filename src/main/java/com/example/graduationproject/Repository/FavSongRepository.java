package com.example.graduationproject.Repository;

import com.example.graduationproject.Domain.FavSong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavSongRepository extends JpaRepository<FavSong, Integer> {

}
