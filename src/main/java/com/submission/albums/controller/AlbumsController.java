package com.submission.albums.controller;

import com.submission.albums.entity.Album;
import com.submission.albums.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class AlbumsController {

    private final AlbumService albumService;

    @Autowired
    public AlbumsController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/albums")
    public List<Album> findAll() {
        return albumService.findAll();
    }

    @GetMapping("/album/{id}")
    public Optional<Album> findById(@PathVariable Integer id) {
        return albumService.findById(id);
    }

    @GetMapping("/albums-of-album-band/{albumName}")
    public List<Album> findAllWithSameBand(@PathVariable String albumName) {
        return albumService.findAllWithSameBand(albumName);
    }

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album) {
        return albumService.insert(album);
    }

    @DeleteMapping("/album/{id}")
    public void deleteAlbum(@PathVariable Integer id) {
        albumService.deleteById(id);
    }

}
