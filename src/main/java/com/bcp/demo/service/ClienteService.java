package com.bcp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bcp.demo.model.Cliente;
import com.bcp.demo.repository.IClienteRepository;

@Service
public class ClienteService implements IClienteService{
    @Autowired
	private IClienteRepository clienteService;
	
	@Override
	@Transactional(readOnly=true) //se podria omitir ya q es por defecto para los nuvos query si se usa transactional
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteService.findAll();
	}

	@Override
	public Cliente create(Cliente cliente) {
		return clienteService.save(cliente);
	}

	@Override
	public Cliente find(Long id) {
		return clienteService.findById(id).orElse(null);
	}

	@Override
	public Cliente update(Cliente cliente) {
		return clienteService.save(cliente);
	}

	@Override
	public void delete(Long id) {
		clienteService.deleteById(id);
	}

}
