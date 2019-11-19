package webApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_")
public class User implements IdEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 431219509752302675L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String login;
	
	@Column
	private String password;
	
	@Column
	private String name;
	
	public User() {
		
		
		
	}

	public User(String login, String password, String name) {
		super();
		this.login = login;
		this.password = password;
		this.name = name;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}
	
	

}
