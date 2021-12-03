package application;


import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("====TESTE1: Seller findById====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n\n====TESTE2: Seller findByDepartment====");

		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);

			System.out.println("\n\n====TESTE2: Seller findByDepartment====");
		}

		System.out.println("\n\n====TESTE3: Seller findAll====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n====TESTE4: Seller insert====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);	
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New ID = " + newSeller.getId());
		
		System.out.println("\n\n====TESTE5: Seller update====");
		seller = sellerDao.findById(1);
		seller.setName("Marta Stewart");
		sellerDao.update(seller);
		System.out.println("Update complete");
		
	}
}
