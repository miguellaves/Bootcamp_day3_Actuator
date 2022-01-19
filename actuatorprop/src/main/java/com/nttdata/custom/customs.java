package com.nttdata.custom;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

//@Component
//@Endpoint(id = "estados")
//public class customs {
//	private List<String> listado = new ArrayList<>();
//	
//	@ReadOperation
//	public List<String> estados() {
//		return listado
//	}
//}

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class customs {
	@GetMapping("/random")
	public ResponseEntity<String> customEndPoint() {
		return new ResponseEntity<>("Algo del controller", HttpStatus.OK);
	}	
}
