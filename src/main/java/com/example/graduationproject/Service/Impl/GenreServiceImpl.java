package com.example.graduationproject.Service.Impl;

import com.example.graduationproject.DAO.CountryDAO;
import com.example.graduationproject.DAO.GenreDAO;
import com.example.graduationproject.Domain.Country;
import com.example.graduationproject.Domain.Genre;
import com.example.graduationproject.Service.GenreService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GenreServiceImpl implements GenreService {
    private GenreDAO genreDAO;

    public void setGenreDAO(GenreDAO genreDAO) {
        this.genreDAO = genreDAO;
    }

    @Override
    @Transactional
    public void addGenre(Genre genre) {
        this.genreDAO.addGenre(genre);
    }

    @Override
    @Transactional
    public void updateGenre(Genre genre) {
        this.genreDAO.updateGenre(genre);
    }

    @Override
    @Transactional
    public void removeGenre(int id) {
        this.genreDAO.removeGenre(id);
    }

    @Override
    public Genre getGenreById(int id) {
        return this.genreDAO.getGenreById(id);
    }
}
