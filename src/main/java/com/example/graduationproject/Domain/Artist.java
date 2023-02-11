package com.example.graduationproject.Domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "artist_site_url")
    private String artistSiteUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getArtistSiteUrl() {
        return artistSiteUrl;
    }

    public void setArtistSiteUrl(String artistSiteUrl) {
        this.artistSiteUrl = artistSiteUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return id == artist.id && Objects.equals(firstName, artist.firstName) && Objects.equals(lastName, artist.lastName) && Objects.equals(country, artist.country) && Objects.equals(artistSiteUrl, artist.artistSiteUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, country, artistSiteUrl);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country=" + country +
                ", artistSiteUrl='" + artistSiteUrl + '\'' +
                '}';
    }

    public Artist() {
    }
}
