package com.example.graduationproject.Domain;

import javax.persistence.*;
import java.util.Objects;
//
@Entity
@Table(name = "fav_songs")
public class FavSong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "song_id")
    private Song song;

    @Column(name = "comment")
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavSong favSong = (FavSong) o;
        return id == favSong.id && Objects.equals(user, favSong.user) && Objects.equals(song, favSong.song) && Objects.equals(comment, favSong.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, song, comment);
    }

    @Override
    public String toString() {
        return "FavSong{" +
                "id=" + id +
                ", user=" + user +
                ", song=" + song +
                ", comment='" + comment + '\'' +
                '}';
    }

    public FavSong() {
    }
}
