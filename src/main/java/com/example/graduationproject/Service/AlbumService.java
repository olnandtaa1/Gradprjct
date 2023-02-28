package com.example.graduationproject.Service;

import com.example.graduationproject.Domain.Album;
import com.example.graduationproject.Domain.Song;

import java.util.List;

public interface AlbumService {
    public void addAlbum(Album album);
    public void updateAlbum(Album album);
    public void removeAlbum(int id);
    public Album getAlbumById(int id);
    public List<Album> listAlbums();
}
