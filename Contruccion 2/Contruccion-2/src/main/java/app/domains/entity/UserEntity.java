package app.domains.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "User")

public class UserEntity {

	public UserEntity(String user, long passaword ) {
		this.user=user;
		this.passaword=passaword;
				
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user")
	private String user;
	
	@Column(name ="password")
	private long passaword;
	
	
	
	
	
	
	
	
	

}
