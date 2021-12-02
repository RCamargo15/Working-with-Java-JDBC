package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	//operação resposavel por inserir no banco de dados obj enviado por parametro
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	// pegar id e consultar no banco de dados
	Department findById(Integer id);
	// retorna todos. Deve ser uma lista
	List<Department> findAll();
	
}
