package br.com.itgcon.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.itgcon.exerciciossb.model.entities.Produto;

public interface ProdutoRepository 
extends CrudRepository<Produto, Integer>{

}
