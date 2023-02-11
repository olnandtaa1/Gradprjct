package com.example.graduationproject.Repository;

import com.example.graduationproject.Domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;
//
public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
