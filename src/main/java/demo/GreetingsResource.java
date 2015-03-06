package demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsResource {
	
	@RequestMapping("/greetings/{name}")
	public String sayHello(@PathVariable String name) {
		return "hello rest app world "+name;
	}

}
