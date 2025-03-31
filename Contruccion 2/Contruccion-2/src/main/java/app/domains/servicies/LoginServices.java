package app.domains.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domains.models.User;
import app.domains.ports.UserPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Service
@Setter
@Getter	
@NoArgsConstructor


public class LoginServices {
	
	
	@Autowired
	private UserPort userPort;
	
	
	
	public User login(User user) throws Exception {
		User uservalidate = userPort.findByUserName(user);
		if(uservalidate == null) {
			throw new Exception("Usuario o contraseña invalido");
		}
		if(user.getPassaword()==uservalidate.getPassaword()) {
			throw new Exception("No");
		}
		

		
		return uservalidate;
	}
	
	

}
