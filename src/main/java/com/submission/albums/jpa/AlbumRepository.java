package com.submission.albums.jpa;

import com.submission.albums.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {

    List<Album> findAllByBandId(Integer id);

    Optional<Album> findAlbumByName(String name);
}
