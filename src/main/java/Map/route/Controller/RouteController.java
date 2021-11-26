package Map.route.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import Map.route.Entity.RouteEntity;
import Map.route.Service.RouteService;

@RestController
@RequestMapping("/api/routedata/")
public class RouteController {
	
	@Autowired
	RouteService routeService;
		
	@PostMapping("save")
	public RouteEntity saveroutedata(@RequestParam("file") MultipartFile file) throws Exception {
		RouteEntity routeEntity = routeService.saveroutedata(file);
		
		return routeEntity;		
		
	}
	
	@GetMapping("/files/{id}")
	public ResponseEntity<byte[]> downloadFile(@PathVariable long id) {
		return routeService.downloadFile(id);
		
	}
}
