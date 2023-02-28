package com.example.graduationproject.util;

import com.example.graduationproject.Domain.Song;
import com.example.graduationproject.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class TestDataCreator {
    private final SongService songService;

    @Autowired
    public TestDataCreator(SongService songService) {
        this.songService = songService;
    }

    @PostConstruct
    public void insertTestData() {
        createTestData().forEach(this.songService::addSong);
    }

    private List<Song> createTestData() {
        Song s1 = new Song();
        s1.setSongId(1);
        s1.setSongTitle("Angel");
        s1.setSongDuration("6:19");

        Song s2 = new Song();
        s2.setSongId(2);
        s2.setSongTitle("Risingson");
        s2.setSongDuration("4:58");

        Song s3 = new Song();
        s3.setSongId(3);
        s3.setSongTitle("Teardrop");
        s3.setSongDuration("5:30");

        Song s4 = new Song();
        s4.setSongId(4);
        s4.setSongTitle("Inertia Creeps");
        s1.setSongDuration("5:57");

        return Arrays.asList(s1, s2, s3, s4);
    }
}
