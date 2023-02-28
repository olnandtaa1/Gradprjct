package com.example.graduationproject.DAO;

import com.example.graduationproject.Domain.Album;

import java.util.List;

public interface AlbumDAO {
    public void addAlbum(Album album);
    public void updateAlbum(Album album);
    public void removeAlbum(int id);
    public Album getAlbumById(int id);
    public List<Album> listAlbums();
}
