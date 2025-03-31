package app.domains.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor


public class Veterinarian extends User{

	public Veterinarian(long id, String name, long age, String role, String user, long passaword) {
		super(id, name, age, role, user, passaword);
	}
	
	

}
