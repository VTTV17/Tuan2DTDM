package bootsample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class SampleRestController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World";
	}
	
	

}
