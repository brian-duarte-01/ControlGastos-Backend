package com.control.gastos.compras.repositorio;

import com.control.gastos.compra.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "compra", collectionResourceRel = "compra")
public interface ComprasRepository extends CrudRepository<Compras, Integer> {

}
