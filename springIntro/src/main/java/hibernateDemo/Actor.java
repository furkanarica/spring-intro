package hibernateDemo;

import jakarta.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {
	
	@Id
	@Column(name="actor_id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	public Actor () {}
 
	public Actor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Getter and Setter Methods
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
}
