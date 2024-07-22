package com.nt.run;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor-api")
public class Actor {

	@GetMapping("find/{name}")
	public ResponseEntity<String> show(@PathVariable String name){
		return new ResponseEntity<String>("name::"+name,HttpStatus.OK);
	}
	
}
