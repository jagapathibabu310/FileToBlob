package Map.route.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import Map.route.Entity.RouteEntity;
import Map.route.Repository.RouteRepository;

@Service
public class RouteServiceImpl implements RouteService {
	
	@Autowired
	RouteRepository routeRepository;

	@Override
	public RouteEntity saveroutedata(MultipartFile file) throws Exception  {
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		
		String fileType = StringUtils.cleanPath(file.getContentType());
				
            RouteEntity routeEntity = new RouteEntity(fileName, fileType, file.getBytes());

            return routeRepository.save(routeEntity);     	
	}

	@Override
	public ResponseEntity<byte[]> downloadFile(long id) {
		
//		final String path = "C:\\Users\\Jaan";
				
		Optional<RouteEntity> routeEntity = routeRepository.findById(id);
		
		RouteEntity routeEntity2 = routeEntity.get();
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(routeEntity2.getFileType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"filename=\"" + routeEntity2.getFileName()+ "\"")
				.body(routeEntity2.getFile());
				
	}    
	
}
