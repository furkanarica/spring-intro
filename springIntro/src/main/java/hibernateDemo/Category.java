package hibernateDemo;

import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@Column(name = "category_id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	//Getter and Setter Methods
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
