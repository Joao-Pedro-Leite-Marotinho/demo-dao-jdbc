package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	//this operation receives an Department as an argument
	//it inserts the object received as a parameter on the database
	void insert(Department obj);
	
	//updates
	void update(Department obj);
	
	//delete a row by id
	void deleteById(Integer id);
	
	//finds a Department by its id
	//it returns null if there's no row with the specified id
	Department finById(Integer id);
	
	//returns all Departments
	List<Department> findAll();
}
