package application;

import java.util.Date;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Department obj = new Department(1, "Books");
		Seller obj1 = new Seller(21, "Bob Brown", "bob@gmail.com", new Date(), 3000.0, obj);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("Insert ID: ");
		int id = sc.nextInt();
		
		Seller seller = sellerDao.findById(id);

		System.out.println(seller);

	}

}
