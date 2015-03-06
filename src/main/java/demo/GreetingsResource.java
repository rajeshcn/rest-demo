package demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author rajesh cn
 *
 */
@RestController
public class GreetingsResource {
	
	/**
	 * 
	 * Change A
	 * Change B
	 * Change C
	 * Change X
	 * 
	 * @param name pathvariable
	 * @return String
	 */
	@RequestMapping("/greetings/{name}")
	public String sayHello(@PathVariable String name) {
		return "hello rest app world "+name;
	}
	//Change D

}
 	
