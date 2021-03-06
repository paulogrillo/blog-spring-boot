package com.paulogrillo.blog.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulogrillo.blog.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByUsuario(String usuario);
	List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	Usuario findByNome(String nome);
}
