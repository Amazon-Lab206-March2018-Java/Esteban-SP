package com.poesteba.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poesteba.lookify.models.Song;
import com.poesteba.lookify.services.SongService;

@Controller
public class Songs {
	
	private SongService sS;
	public Songs(SongService sS) {
		this.sS = sS;
	}
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/dashboard")
	public String dashboard(Model m) {
		m.addAttribute("songs", sS.allSongs());
		return "dashboard";
	}
	@RequestMapping("/songs/{id}")
	public String show_song(@PathVariable("id") Long id,@ModelAttribute("song") Song song, Model m) {
		m.addAttribute("song",sS.findSongById(id));
		return "details";
	}
	@RequestMapping("/songs/new")
	public String new_song(@ModelAttribute("song") Song song) {
		return "newSong";
	}
	@PostMapping("/songs/new")
	public String show_song(@Valid @ModelAttribute("song") Song song, BindingResult res, Model m) {
		if(res.hasErrors()) {
			return "newSong";
		}else {
			sS.addSong(song);
			return "redirect:/dashboard";
		}
	}
	@PostMapping("/search/")
	public String search(@RequestParam("artistSearch") String search, Model m) {
		m.addAttribute("songs",sS.searchByArtist(search));
		m.addAttribute("search",search);
		return "searchResults";
	}
	@RequestMapping("/search/topTen")
	public String search(Model m) {
		m.addAttribute("songs",sS.topTen());
		return "topTen";
	}
	@RequestMapping("/songs/delete/{id}")
	public String destroySong(@PathVariable("id") Long id) {
		sS.destroySong(id);
		return "redirect:/dashboard";
	}
}

