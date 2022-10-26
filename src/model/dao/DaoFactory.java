package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//when instancing a new SellerDao, Program will call for DaoFactory
	//when using this implementation, the Program only calls the interface
	//dependency injection without expliciting the implementation
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
}
