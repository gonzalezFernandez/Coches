package com.formacionSpringBoot.Coches.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionSpringBoot.Coches.modelo.Usuario;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
	public Usuario findByUsername(String username);

	
}
