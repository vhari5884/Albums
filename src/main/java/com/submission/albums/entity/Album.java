package com.submission.albums.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Album {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate released;

    private String description;

    private Integer songsCount;

    private Integer bandId;

    public Album() {
    }

    public Album(String name, LocalDate released, String description, Integer songsCount, Integer bandId) {
        this.name = name;
        this.released = released;
        this.description = description;
        this.songsCount = songsCount;
        this.bandId = bandId;
    }

    public Album(Integer id, String name, LocalDate released, String description, Integer songsCount, Integer bandId) {
        this.id = id;
        this.name = name;
        this.released = released;
        this.description = description;
        this.songsCount = songsCount;
        this.bandId = bandId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleased() {
        return released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSongsCount() {
        return songsCount;
    }

    public void setSongsCount(Integer songsCount) {
        this.songsCount = songsCount;
    }

    public Integer getBandId() {
        return bandId;
    }

    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }
}
