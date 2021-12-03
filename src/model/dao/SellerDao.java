package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	// pegar id e consultar no banco de dados
	Seller findById(Integer id);
	// retorna todos. Deve ser uma lista
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);

}
