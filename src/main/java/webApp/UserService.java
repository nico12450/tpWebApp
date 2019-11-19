package webApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository ur;
	
	public User findOneByLogin(String login) {
		
		return ur.findOneByLogin(login);
		
	}
	
	public void insertOne(User u) {
		
		ur.save(u);
		
	}
	
	public User findById(long id) {
		
		return ur.find(id);
		
	}
	
	public void update(User u) {
		
		ur.update(u);
		
	}
	
	public List<User> findAll(){
		
		return ur.findAll();
		
	}
	
	public void delete(long id) {
		
		ur.delete(id);
		
	}

}
