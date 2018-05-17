package com.poesteba.lookify.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poesteba.lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {
	ArrayList<Song> findAll();
	ArrayList<Song> findByArtistContaining(String search);
    ArrayList<Song> findTop10ByOrderByRatingDesc();
}
