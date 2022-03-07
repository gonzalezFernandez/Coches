package com.formacionSpringBoot.Coches.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionSpringBoot.Coches.dao.UsuarioDao;
import com.formacionSpringBoot.Coches.modelo.Usuario;

@Service
public class ServicioUsuario implements UserDetailsService {

	private Logger logger = LoggerFactory.getLogger(ServicioUsuario.class);
	
	@Autowired
	UsuarioDao usuarioDao;

	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = usuarioDao.findByUsername(username);

		if (usuario == null) {
			logger.error("Error en el login, no existe el usuario "+username);

		}
		List<GrantedAuthority> authorities = usuario.getRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Roles : "+authority.getAuthority()))
				.collect(Collectors.toList());
				
		return new User(usuario.getUsername(),usuario.getPassword(),usuario.isEnabled(),true,true,true,authorities);
	}

}
