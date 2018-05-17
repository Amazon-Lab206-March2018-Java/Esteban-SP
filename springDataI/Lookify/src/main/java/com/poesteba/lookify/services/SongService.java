package com.poesteba.lookify.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.poesteba.lookify.models.Song;
import com.poesteba.lookify.repositories.SongRepository;

@Service
public class SongService {
	private SongRepository sR;
	public SongService(SongRepository sR) {
		this.sR = sR;
	}
	public ArrayList<Song> allSongs(){
		return sR.findAll();
	}
	public void addSong(Song song) {
		sR.save(song);
	}
	public Song findSongById(Long id) {
		Optional<Song> optSong = sR.findById(id);
		if(optSong.isPresent()) {
			return sR.findById(id).get();	
		}else {
			return null;
		}
	}
	public ArrayList<Song> searchByArtist(String search){
		ArrayList<Song> songs = sR.findByArtistContaining(search);
		return songs;
	}
	public ArrayList<Song> topTen(){
		ArrayList<Song> songs = sR.findTop10ByOrderByRatingDesc();
		return songs;
	}
	public void destroySong(Long id){
		sR.deleteById(id);
	}
}
