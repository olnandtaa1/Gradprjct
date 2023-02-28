package com.example.graduationproject.DAO;

import com.example.graduationproject.Domain.Country;
import com.example.graduationproject.Domain.Genre;

public interface GenreDAO {
    public void addGenre(Genre genre);
    public void updateGenre(Genre genre);
    public void removeGenre(int id);
    public Genre getGenreById(int id);
}
