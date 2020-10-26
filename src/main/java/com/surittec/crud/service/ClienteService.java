package com.surittec.crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surittec.crud.entity.Cliente;
import com.surittec.crud.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private EnderecoService enderecoService;
	
	public Cliente saveCliente(Cliente cliente) {
		return repository.save(cliente);
	}

	public List<Cliente> saveClientes(List<Cliente> clientes) {
		return repository.saveAll(clientes);
	}

	public List<Cliente> getClientes() {
		return repository.findAll();
	}

	public Cliente getClienteById(Long id) {		
		return repository.findById(id).orElse(null);
	}
	
	public Cliente getClienteByNome(String nome) {
		return repository.findByNome(nome);
	}

	@Transactional
	public Cliente updateCliente(Cliente cliente) {
		Cliente existCliente = repository.findById(cliente.getId()).orElse(null);
	
		existCliente.setNome(cliente.getNome());
		existCliente.setCpf(cliente.getCpf());
		existCliente.setTelefone(cliente.getTelefone());
		existCliente.setEmail(cliente.getEmail());
		enderecoService.updateEndereco(cliente.getEndereco());
		return repository.save(existCliente);		
	}
	
	@Transactional
	public String deleteCliente(Long id) {
		repository.deleteById(id);
		return "Cliente removido!" + id;
	}
}
