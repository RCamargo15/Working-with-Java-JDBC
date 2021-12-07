package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * SellerDao sellerDao = DaoFactory.createSellerDao();
		 * 
		 * System.out.println("====TESTE1: Seller findById===="); Seller seller =
		 * sellerDao.findById(3); System.out.println(seller);
		 * 
		 * 
		 * System.out.println("\n\n====TESTE2: Seller findByDepartment===="); Department
		 * department = new Department(1, null); List<Seller> list =
		 * sellerDao.findByDepartment(department); for (Seller obj : list) {
		 * System.out.println(obj); }
		 * 
		 * System.out.println("\n\n====TESTE3: Seller findAll===="); list =
		 * sellerDao.findAll(); for (Seller obj : list) { System.out.println(obj); }
		 * 
		 * System.out.println("\n\n====TESTE4: Seller insert===="); Seller newSeller =
		 * new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		 * sellerDao.insert(newSeller); System.out.println("Inserted! New ID = " +
		 * newSeller.getId());
		 * 
		 * System.out.println("\n\n====TESTE5: Seller update===="); seller =
		 * sellerDao.findById(1); seller.setName("Robin Hood");
		 * sellerDao.update(seller); System.out.println("Updated!");
		 * 
		 * System.out.println("\n\n====TESTE6: Seller delete====");
		 * System.out.println("Enter id for delete test"); int id = sc.nextInt();
		 * sellerDao.deleteById(id); System.out.println("Seller deleted");
		 */

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=====DEPARTMENT TEST 1 - INSERT");
		Department dep1 = new Department(null, "Drugs");
		departmentDao.insert(dep1);
		System.out.println("Department inserted! New ID: " + dep1.getId());

		System.out.println("=====DEPARTMENT TEST 2 - findById");
		dep1 = departmentDao.findById(3);
		System.out.println(dep1);

		System.out.println("=====DEPARTMENT TEST 3 - Delete");
		System.out.println("Insert an ID to be deleted");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("ID " + id + " sucessfully deleted from the table");

		System.out.println("=====DEPARTMENT TEST 4 - Update");
		dep1 = departmentDao.findById(12);
		dep1.setName("Alcohol");
		departmentDao.update(dep1);
		System.out.println("UPDATED");

		System.out.println("=====DEPARTMENT TEST 5 - findAll");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

	}

}
