package lt.vtmc.gallerium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lt.vtmc.gallerium.model.Artist;
import lt.vtmc.gallerium.service.ArtistService;

@Controller
public class ArtistController {

	@Autowired
	private ArtistService artistService;
	
	@RequestMapping(path = {"/search"})
	public String home(Artist artist, Model model, String keyword) {
		if (keyword != null) {
			List<Artist> list = artistService.getByKeyword(keyword);
			model.addAttribute("list", list);
		} else {
			List<Artist> list = artistService.getAllArtists();
			model.addAttribute("list", list);
		}
		
		return "search";
	}
}
