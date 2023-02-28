package com.example.graduationproject.DAO;

import com.example.graduationproject.Domain.Song;

import java.util.List;

public interface SongDao {
    public void addSong(Song song);
    public void updateSong(Song song);
    public void removeSong(int id);
    public Song getSongById(int id);
    public List<Song> listSongs();
}
