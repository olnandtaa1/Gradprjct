package com.example.graduationproject.DAO;

import com.example.graduationproject.Domain.Album;
import com.example.graduationproject.Domain.Artist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArtistDAOImpl implements ArtistDAO{
    private static final Logger logger = LoggerFactory.getLogger(ArtistDAOImpl.class);
    private final SessionFactory sessionFactory;

    @Autowired
    public ArtistDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addArtist(Artist artist) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(artist);
        logger.info("Artist is successfully saved. Artist details: " + artist);

    }

    @Override
    public void updateArtist(Artist artist) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(artist);
        logger.info("Artist is successfully updated. Artist details: " + artist);
    }

    @Override
    public void removeArtist(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Artist artist = session.load(Artist.class, id);
        if (artist!=null) {
            session.delete(artist);
        }
        logger.info("Artist is successfully removed. Artist details: " + artist);
    }

    @Override
    public Artist getArtistById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Artist artist = session.load(Artist.class, id);
        logger.info("Artist is successfully loaded. Artist details: " + artist);
        return null;
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<Artist> listArtists() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Artist> artistList = session.createQuery("from Artist").list();
        for (Artist artist: artistList){
            logger.info("Artist list: " + artist);
        }
        return artistList;
    }
}
