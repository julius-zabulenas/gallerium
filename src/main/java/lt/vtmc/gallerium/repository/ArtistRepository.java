package lt.vtmc.gallerium.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lt.vtmc.gallerium.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {

	@Query(value = "SELECT * FROM artists WHERE Name LIKE %:keyword%", nativeQuery = true)
	
	List<Artist> findByKeyword(@Param("keyword") String keyword);
}
