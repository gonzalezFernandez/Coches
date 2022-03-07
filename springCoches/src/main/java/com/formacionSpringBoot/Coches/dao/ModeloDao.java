package com.formacionSpringBoot.Coches.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionSpringBoot.Coches.modelo.Modelo;

@Repository
public interface ModeloDao extends CrudRepository<Modelo, Long> {

}
