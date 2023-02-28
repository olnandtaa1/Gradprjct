package com.example.graduationproject.Service;

import com.example.graduationproject.Domain.Genre;

public interface GenreService {
    public void addGenre(Genre genre);
    public void updateGenre(Genre genre);
    public void removeGenre(int id);
    public Genre getGenreById(int id);
}
