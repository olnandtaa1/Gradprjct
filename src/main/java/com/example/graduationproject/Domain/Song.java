package com.example.graduationproject.Domain;

import com.example.graduationproject.Domain.Album;
import com.example.graduationproject.Domain.Genre;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private int songId;

    @Column(name = "song_title")
    private String songTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @Column(name = "song_duration")
    private String songDuration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "album_id")
    private Album album;

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(String songDuration) {
        this.songDuration = songDuration;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return songId == song.songId && Objects.equals(songTitle, song.songTitle) && Objects.equals(genre, song.genre) && Objects.equals(songDuration, song.songDuration) && Objects.equals(album, song.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, songTitle, genre, songDuration, album);
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", songTitle='" + songTitle + '\'' +
                ", genre=" + genre +
                ", songDuration='" + songDuration + '\'' +
                ", album=" + album +
                '}';
    }


}
