package com.bcp.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.bcp.demo.model.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
