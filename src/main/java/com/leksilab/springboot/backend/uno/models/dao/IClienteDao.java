package com.leksilab.springboot.backend.uno.models.dao;

import com.leksilab.springboot.backend.uno.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
