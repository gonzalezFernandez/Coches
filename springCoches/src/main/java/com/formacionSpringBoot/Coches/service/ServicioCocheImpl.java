package com.formacionSpringBoot.Coches.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionSpringBoot.Coches.dao.CocheDao;
import com.formacionSpringBoot.Coches.modelo.Coche;
import com.formacionSpringBoot.Coches.modelo.Marca;
import com.formacionSpringBoot.Coches.modelo.Modelo;

@Service
public class ServicioCocheImpl implements ServicioCoche {

	@Autowired
	private CocheDao cocheDao;

	@Override
	@Transactional(readOnly = true)
	public List<Coche> findAll() {
		return (List<Coche>) cocheDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Coche findById(Long id) {
		return cocheDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Marca> findAllMarcas() {
		return cocheDao.findAllMarcas();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Modelo> findAllModelos() {
		return cocheDao.findAllModelos();
	}

	@Override
	@Transactional
	public Coche save(Coche coche) {
		return cocheDao.save(coche);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		cocheDao.deleteById(id);
	}

	@Override
	@Transactional
	public Coche deleteConRetorno(Long id) {
		Coche coche = cocheDao.findById(id).get();
		cocheDao.deleteById(id);
		return coche;
	}

}
