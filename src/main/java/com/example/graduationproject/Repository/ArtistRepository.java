package com.example.graduationproject.Repository;

import com.example.graduationproject.Domain.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
//
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

}
