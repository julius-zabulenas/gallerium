package lt.vtmc.gallerium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lt.vtmc.gallerium.model.Artist;
import lt.vtmc.gallerium.service.ArtistService;

@Controller
public class ArtistController {

	private ArtistService artistService;
	
	@Autowired
	public ArtistController(ArtistService artistService) {
		this.artistService = artistService;
	}

	@GetMapping("/search")
	public String home(Model model, String keyword) {
		if (keyword != "") {
			List<Artist> list = artistService.getByKeyword(keyword);
			model.addAttribute("list", list);
			
			return "search";
		} else {
			return "searchEmptyError";
		}
	}
}
