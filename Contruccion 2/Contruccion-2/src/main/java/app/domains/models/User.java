package app.domains.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class User extends Person  {
	private String user;
	private long passaword;
	public User(long id, String name, long age, String role, String user, long passaword) {
		super(id, name, age, role);
		this.user = user;
		this.passaword = passaword;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public long getPassaword() {
		return passaword;
	}
	public void setPassaword(long passaword) {
		this.passaword = passaword;
	}
	
	
	
	
	
	
	
	
	}
	
	
	


