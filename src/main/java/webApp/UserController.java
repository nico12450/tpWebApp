package webApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import webApp.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<User> findAll() {
		
		return userService.findAll();
		
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	public User findById(@PathVariable Long id) {
		
		return userService.findById(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void insert(@RequestBody User resource) {
		
		userService.insertOne(resource);
	
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public void update(@RequestBody User resource) {
	
		userService.update(resource);
		
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable Long id) {
	
		userService.delete(id);
		
	}
	

}
