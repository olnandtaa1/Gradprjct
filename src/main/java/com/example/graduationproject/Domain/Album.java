package com.example.graduationproject.Domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_id")
    private int albumId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @Column(name = "album_title")
    private String albumTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @Column(name = "album_year")
    private int albumYear;

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getAlbumYear() {
        return albumYear;
    }

    public void setAlbumYear(int albumYear) {
        this.albumYear = albumYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return albumId == album.albumId && albumYear == album.albumYear && Objects.equals(artist, album.artist) && Objects.equals(albumTitle, album.albumTitle) && Objects.equals(genre, album.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, artist, albumTitle, genre, albumYear);
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", artist=" + artist +
                ", albumTitle='" + albumTitle + '\'' +
                ", genre=" + genre +
                ", albumYear=" + albumYear +
                '}';
    }

    public Album() {
    }
}
