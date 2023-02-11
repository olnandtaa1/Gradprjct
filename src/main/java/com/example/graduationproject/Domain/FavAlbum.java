package com.example.graduationproject.Domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "fav_albums")
public class FavAlbum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "album_id")
    private Album album;

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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
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
        FavAlbum favAlbum = (FavAlbum) o;
        return id == favAlbum.id && Objects.equals(user, favAlbum.user) && Objects.equals(album, favAlbum.album) && Objects.equals(comment, favAlbum.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, album, comment);
    }

    @Override
    public String toString() {
        return "FavAlbum{" +
                "id=" + id +
                ", user=" + user +
                ", album=" + album +
                ", comment='" + comment + '\'' +
                '}';
    }

    public FavAlbum() {
    }
}
