package app.domains.ports;



import app.domains.models.User;

public interface UserPort {
	
	public boolean existUser(String user);
	public boolean saveUser(String user);
	public boolean findByDocument(String user);
	public User findByUserName(User user);
	
	
	
	
	

}
