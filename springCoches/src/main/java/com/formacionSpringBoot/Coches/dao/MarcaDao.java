package com.formacionSpringBoot.Coches.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionSpringBoot.Coches.modelo.Marca;

@Repository
public interface MarcaDao extends CrudRepository<Marca, Long> {

}