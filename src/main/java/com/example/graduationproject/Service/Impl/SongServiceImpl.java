package com.example.graduationproject.Service.Impl;

import com.example.graduationproject.DAO.SongDao;
import com.example.graduationproject.Domain.Song;
import com.example.graduationproject.Service.SongService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    private SongDao songDao;

    public void setSongDAO(SongDao songDao) {
        this.songDao = songDao;
    }

    @Override
    @Transactional
    public void addSong(Song song) {
        this.songDao.addSong(song);
    }

    @Override
    @Transactional
    public void updateSong(Song song) {
        this.songDao.updateSong(song);
    }

    @Override
    @Transactional
    public void removeSong(int id) {
        this.songDao.removeSong(id);
    }



    @Override
    @Transactional
    public Song getSongById(int id) {
        return this.songDao.getSongById(id);
    }

    @Override
    @Transactional
    public List<Song> listSongs() {
        return this.songDao.listSongs();
    }
}
