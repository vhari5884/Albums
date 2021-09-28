package com.submission.albums.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Band {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int noOfMembers;

    public Band() {
    }

    public Band(String name, int noOfMembers) {
        this.name = name;
        this.noOfMembers = noOfMembers;
    }

    public Band(int id, String name, int noOfMembers) {
        this.id = id;
        this.name = name;
        this.noOfMembers = noOfMembers;
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

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }
}
