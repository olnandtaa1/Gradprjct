package com.example.graduationproject.Service.Impl;

import com.example.graduationproject.DAO.AlbumDAO;
import com.example.graduationproject.DAO.SongDao;
import com.example.graduationproject.Domain.Album;
import com.example.graduationproject.Domain.Song;
import com.example.graduationproject.Service.AlbumService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class AlbumServiceImpl implements AlbumService {
    private AlbumDAO albumDAO;

    public void setAlbumDAO(AlbumDAO albumDAO) {
        this.albumDAO = albumDAO;
    }

    @Override
    @Transactional
    public void addAlbum(Album album) {
        this.albumDAO.addAlbum(album);
    }

    @Override
    @Transactional
    public void updateAlbum(Album album) {
        this.albumDAO.updateAlbum(album);
    }

    @Override
    @Transactional
    public void removeAlbum(int id) {
        this.albumDAO.removeAlbum(id);
    }


    @Override
    @Transactional
    public Album getAlbumById(int id) {
        return this.albumDAO.getAlbumById(id);
    }

    @Override
    @Transactional
    public List<Album> listAlbums() {
        return this.albumDAO.listAlbums();
    }
}
