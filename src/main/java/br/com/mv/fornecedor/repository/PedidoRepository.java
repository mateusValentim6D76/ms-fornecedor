package br.com.mv.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.mv.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
