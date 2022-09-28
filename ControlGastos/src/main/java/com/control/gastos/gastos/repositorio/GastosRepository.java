package com.control.gastos.gastos.repositorio;

import com.control.gastos.gasto.Gastos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "gasto", collectionResourceRel = "gasto")
public interface GastosRepository extends CrudRepository<Gastos,Integer> {
}
