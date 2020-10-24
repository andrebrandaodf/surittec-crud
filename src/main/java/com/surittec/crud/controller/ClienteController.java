package com.surittec.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surittec.crud.entity.Cliente;
import com.surittec.crud.service.ClienteService;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/clientes")
	public Cliente addCliente(@RequestBody Cliente Cliente) {
		return clienteService.saveCliente(Cliente);
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente findClienteById(@PathVariable Long id){
		return clienteService.getClienteById(id);
	}
	
	@PutMapping("/clientes/{id}")
	public Cliente updateCliente(@RequestBody Cliente Cliente, @PathVariable Long id) {
		return clienteService.updateCliente(Cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	public String deleteCliente(@PathVariable Long id) {
		return clienteService.deleteCliente(id);
	}
}	
