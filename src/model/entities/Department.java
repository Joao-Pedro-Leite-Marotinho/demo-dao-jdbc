package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{
	
	
	// implementing serializable allows our object to be shared through the network or saved has an archive
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	// empty constructor
	public Department() {
	}

	//constructor
	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// hashcode and equals comparates objects by they content
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
