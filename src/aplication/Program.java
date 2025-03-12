package aplication;

import java.util.Date;
import java.util.List;

import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entites.Department;
import model.entites.Seller;

public class Program {
	
	public static void main(String args[]) {
		
		
		
		System.out.println("\n=== TEST 3: seller findAll =====");
		Department department = new Department(2, null);
		try {
			List<Seller> list = SellerDao.findByDepartment(department);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}