package com.surittec.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surittec.crud.entity.Cliente;
import com.surittec.crud.entity.Endereco;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Cliente findByNome(String nome);

	Optional<Cliente> findById(Long id);

	void deleteById(Long id);

}
