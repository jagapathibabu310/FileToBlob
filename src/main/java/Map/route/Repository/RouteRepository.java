package Map.route.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Map.route.Entity.RouteEntity;

@Repository
public interface RouteRepository extends JpaRepository<RouteEntity, Long>{
	
	
}
