package com.formacionSpringBoot.Coches.service;

import java.util.List;

import com.formacionSpringBoot.Coches.modelo.Coche;
import com.formacionSpringBoot.Coches.modelo.Marca;
import com.formacionSpringBoot.Coches.modelo.Modelo;

public interface ServicioCoche {

	public List<Coche> findAll();

	public Coche findById(Long id);

	public List<Marca> findAllMarcas();

	public List<Modelo> findAllModelos();

	public Coche save(Coche coche);

	public void delete(Long id);

	public Coche deleteConRetorno(Long id);

}
