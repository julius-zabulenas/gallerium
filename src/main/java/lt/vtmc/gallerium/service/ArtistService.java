package lt.vtmc.gallerium.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.vtmc.gallerium.model.Artist;
import lt.vtmc.gallerium.repository.ArtistRepository;

@Service
public class ArtistService {

	@Autowired
	private ArtistRepository artistRepository;

//	Get the list of shops
	public List<Artist> getAllArtists() {
		List<Artist> list = (List<Artist>) artistRepository.findAll();
		
		return list;
	}
	
//	Get artist by keyword
	public List<Artist> getByKeyword(String keyword) {
		return artistRepository.findByKeyword(keyword);
	}
}
