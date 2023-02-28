package com.example.graduationproject.DAO;

import com.example.graduationproject.Domain.Album;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlbumDAOImpl implements AlbumDAO{
    private static final Logger logger = LoggerFactory.getLogger(ArtistDAOImpl.class);
    private final SessionFactory sessionFactory;

    @Autowired
    public AlbumDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addAlbum(Album album) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(album);
        logger.info("Album is successfully saved. Album details: " + album);
    }

    @Override
    public void updateAlbum(Album album) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(album);
        logger.info("Album is successfully updated. Album details: " + album);
    }

    @Override
    public void removeAlbum(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Album album = session.load(Album.class, id);
        if (album!=null) {
            session.delete(album);
        }
        logger.info("Album is successfully removed. Album details: " + album);
    }

    @Override
    public Album getAlbumById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Album album = session.load(Album.class, id);
        logger.info("Album is successfully loaded. Album details: " + album);
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Album> listAlbums() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Album> albumList = session.createQuery("from Album").list();
        for (Album album: albumList){
            logger.info("Album list: " + album);
        }
        return albumList;
    }
}
