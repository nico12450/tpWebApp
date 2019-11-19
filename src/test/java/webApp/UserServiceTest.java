package webApp;

import static org.junit.Assert.fail;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = App.class)
@Transactional
public class UserServiceTest {

	@Autowired
	private WebApplicationContext context;
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testSave(){
		
		User u1 = new User("userTestUnitaire","mdpTestUnitaire","nameTestUnitaire");
		
		u1 = userRepository.save(u1);
		
		if(u1.getId() == null) {
			
			fail();
			
		}
		
	}
	
}
