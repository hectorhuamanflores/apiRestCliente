package com.bcp.demo.service;

import java.util.List;

import com.bcp.demo.model.Cliente;

public interface IClienteService {
	
	List<Cliente> findAll();

	Cliente create(Cliente cliente);

	Cliente find(Long id);

	Cliente update(Cliente cliente);

	void delete(Long id);
}
