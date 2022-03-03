package lt.vtmc.gallerium.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.vtmc.gallerium.model.Artist;
import lt.vtmc.gallerium.repository.ArtistRepository;

@Service
public class ArtistService {

	private ArtistRepository artistRepository;

	@Autowired
	public ArtistService(ArtistRepository artistRepository) {
		this.artistRepository = artistRepository;
	}

//	Get artist by keyword
	public List<Artist> getByKeyword(String keyword) {
		return artistRepository.findByKeyword(keyword);
	}
}
