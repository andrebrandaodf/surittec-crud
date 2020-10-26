package com.surittec.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surittec.crud.entity.Endereco;
import com.surittec.crud.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repositoryEndereco;
	
	public Endereco saveEndereco(Endereco endereco) {
		return repositoryEndereco.save(endereco);
	}
	
	public List<Endereco> saveEnderecos(List<Endereco> enderecos) {
		return repositoryEndereco.saveAll(enderecos);
	}


	public List<Endereco> getEnderecos() {
		return repositoryEndereco.findAll();
	}

	public Endereco getEnderecoById(Long id) {
		return repositoryEndereco.findById(id).orElse(null);
	}
	
	public Endereco getEnderecoByCep(String cep) {
		return repositoryEndereco.findByCep(cep);
	}

	public Endereco updateEndereco(Endereco endereco) {
		Endereco existEndereco = repositoryEndereco.findById(endereco.getId()).orElse(null);
		
		existEndereco.setCep(endereco.getCep());
		existEndereco.setLogradouro(endereco.getLogradouro());
		existEndereco.setBairro(endereco.getBairro());
		existEndereco.setLocalidade(endereco.getLocalidade());
		existEndereco.setUf(endereco.getUf());
		existEndereco.setComplemento(endereco.getComplemento());
		return repositoryEndereco.save(existEndereco);		
	}
	
	public String deleteEndereco(Long id) {
		repositoryEndereco.deleteById(id);
		return "Endereco removido!" + id;
	}
}
