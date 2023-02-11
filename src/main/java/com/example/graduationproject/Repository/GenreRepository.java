package com.example.graduationproject.Repository;

import com.example.graduationproject.Domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
