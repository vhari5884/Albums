package com.submission.albums.service;

import com.submission.albums.entity.Album;
import com.submission.albums.jpa.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    private final AlbumRepository albumRepository;

    @Autowired
    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    public Optional<Album> findById(Integer id) {
        return albumRepository.findById(id);
    }

    public List<Album> findAllWithSameBand(String albumName) {
        Optional<Album> album = albumRepository.findAlbumByName(albumName);
        return album.isPresent() ? albumRepository.findAllByBandId(album.get().getBandId()) : new ArrayList<>();
    }

    public Album insert(Album album) {
        return albumRepository.save(album);
    }

    public void deleteById(Integer id) {
        albumRepository.deleteById(id);
    }
}
