package Map.route.Service;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import Map.route.Entity.RouteEntity;

@Service
public interface RouteService {

	RouteEntity saveroutedata(MultipartFile file) throws Exception;

	ResponseEntity<byte[]> downloadFile(long id);

	

	

	

	

	

}
