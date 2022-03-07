package com.formacionSpringBoot.Coches.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionSpringBoot.Coches.modelo.Coche;
import com.formacionSpringBoot.Coches.modelo.Marca;
import com.formacionSpringBoot.Coches.modelo.Modelo;

@Repository
public interface CocheDao extends CrudRepository<Coche, Long> {


	@Query("from Marca")
	public List<Marca> findAllMarcas();

	@Query("from Modelo")
	public List<Modelo> findAllModelos();

}
