package com.surittec.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surittec.crud.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

	Optional<Endereco> findById(Long id);

	Endereco findByCep(String cep);
}
