package com.example.graduationproject.DAO;

import com.example.graduationproject.Domain.Country;
import com.example.graduationproject.Domain.Genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class GenreDAOImpl implements GenreDAO{
    private static final Logger logger = LoggerFactory.getLogger(GenreDAOImpl.class);
    private final SessionFactory sessionFactory;

    @Autowired
    public GenreDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addGenre(Genre genre) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(genre);
        logger.info("Genre is successfully saved. Genre details: " + genre);
    }

    @Override
    public void updateGenre(Genre genre) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(genre);
        logger.info("Genre is successfully updated. Genre details: " + genre);
    }

    @Override
    public void removeGenre(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Genre genre = session.load(Genre.class, id);
        if (genre!=null) {
            session.delete(genre);
        }
        logger.info("Genre is successfully removed. Genre details: " + genre);
    }

    @Override
    public Genre getGenreById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Genre genre = session.load(Genre.class, id);
        logger.info("Genre is successfully loaded. Genre details: " + genre);
        return null;
    }
}
