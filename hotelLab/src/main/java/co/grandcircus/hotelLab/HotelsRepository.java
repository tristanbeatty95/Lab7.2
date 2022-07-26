package co.grandcircus.hotelLab;



import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelsRepository extends MongoRepository<Hotels, String>{

	
	
	List<Hotels> findAll();
	
	Optional<Hotels> findById(String id);
	
	List<Hotels> findByCity(String city);
}
