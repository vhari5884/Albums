package com.submission.albums.controller;

import com.submission.albums.entity.Band;
import com.submission.albums.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BandController {
    private final BandService bandService;

    @Autowired
    public BandController(BandService bandService) {
        this.bandService = bandService;
    }

    @GetMapping("/bands")
    public List<Band> findAll() {
        return bandService.findAll();
    }

    @GetMapping("/band/{id}")
    public Optional<Band> findById(@PathVariable Integer id) {
        return bandService.findById(id);
    }

    @PostMapping("/band")
    public Band saveBand(@RequestBody Band band) {
        return bandService.insert(band);
    }

    @DeleteMapping("/band/{id}")
    public void deleteBand(@PathVariable Integer id) {
        bandService.deleteById(id);
    }
}
