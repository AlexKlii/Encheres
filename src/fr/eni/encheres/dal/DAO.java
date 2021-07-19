package fr.eni.encheres.dal;

import java.util.List;

public interface DAO<T> {
	//Sélectionner un business object par son id
	public T selectById(int i) throws DALException;
	
	//Sélectionner tous les business objects 
	public List<T> selectAll() throws DALException;
	
	//Modifier les attributs d'un business object
	public int update(T data) throws DALException;
	
	//Insérer un nouveau business object
	public int insert(T data) throws DALException;
	
	//Supprimer un business object
	public void delete(T obj) throws DALException;
}