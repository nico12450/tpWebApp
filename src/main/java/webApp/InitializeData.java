package webApp;

import javax.annotation.PostConstruct;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class InitializeData {

	@Autowired
	private UserService userService;
	
	@PostConstruct
	protected void initialize() {
		
		User u1 = new User("loginTest","mdpTest","nomTest");
		User u2 = new User("loginTest2","mdpTest2","nomTest2");
		
		if(!exist(u1)) {
			
			userService.insertOne(u1);
			
		}
		
		if(!exist(u2)) {
			
			userService.insertOne(u2);
			
		}
		
	}
	
	public boolean exist(User u) {
		
		try {
			
			userService.findOneByLogin(u.getLogin());
			
		}
		
		catch(NoResultException e) {
			
			return false;
			
		}
		
		return true;
		
	}
	
}
