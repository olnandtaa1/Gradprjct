package com.example.graduationproject.DAO;

import com.example.graduationproject.Domain.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

@Component
public class SongDaoImpl implements SongDao{

    private static final Logger logger = LoggerFactory.getLogger(SongDaoImpl.class);
    private final SessionFactory sessionFactory;

    @Autowired
    public SongDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addSong(Song song) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(song);
        logger.info("Song is successfully saved. Song details: " + song);

    }

    @Override
    public void updateSong(Song song) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(song);
        logger.info("Song is successfully updated. Song details: " + song);

    }

    @Override
    public void removeSong(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Song song = session.load(Song.class, id);
        if (song!=null) {
            session.delete(song);
        }
        logger.info("Song is successfully removed. Song details: " + song);
    }

    @Override
    public Song getSongById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Song song = session.load(Song.class, id);
        logger.info("Song is successfully loaded. Song details: " + song);
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Song> listSongs() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Song> songList = session.createQuery("from Song").list();
        for (Song song: songList){
            logger.info("Song list: " + song);
        }
        return songList;
    }
}
