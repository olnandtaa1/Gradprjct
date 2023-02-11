package com.example.graduationproject.Domain;

import javax.persistence.*;
import java.util.Objects;
//
@Entity
@Table(name = "album_reviews")
public class AlbumReview {
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

    @Column(name = "ranking")
    private int ranking;

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

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
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
        AlbumReview that = (AlbumReview) o;
        return id == that.id && ranking == that.ranking && Objects.equals(user, that.user) && Objects.equals(album, that.album) && Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, album, ranking, comment);
    }

    @Override
    public String toString() {
        return "AlbumReview{" +
                "id=" + id +
                ", user=" + user +
                ", album=" + album +
                ", ranking=" + ranking +
                ", comment='" + comment + '\'' +
                '}';
    }

    public AlbumReview() {
    }
}
