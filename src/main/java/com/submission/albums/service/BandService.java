package com.submission.albums.service;

import com.submission.albums.entity.Band;
import com.submission.albums.jpa.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BandService {
    private final BandRepository bandRepository;

    @Autowired
    public BandService(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }

    public List<Band> findAll() {
        return bandRepository.findAll();
    }

    public Optional<Band> findById(Integer id) {
        return bandRepository.findById(id);
    }

    public Band insert(Band band) {
        return bandRepository.save(band);
    }

    public void deleteById(Integer id) {
        bandRepository.deleteById(id);
    }
}
