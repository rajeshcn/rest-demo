package demo;

import javax.ws.rs.GET;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsResource {
	
	@GET
	@RequestMapping("/greetings/{name}")
	public String sayHello(@PathVariable String name) {
		return "hello rest app world "+name;
	}

}
