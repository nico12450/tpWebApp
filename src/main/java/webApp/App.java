package webApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		UserService myServiceJpa = context.getBean(UserService.class);
		
		User u1 = new User("loginTest","mdpTest","nomTest");
		myServiceJpa.insertOne(u1);
		
		context.close();
		
	}

}
