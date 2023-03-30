package br.com.mv.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mv.fornecedor.model.InfoFornecedor;
import br.com.mv.fornecedor.repository.InfoFornecedorRepository;

@Service
public class InfoFornecedorService {

	@Autowired
	private InfoFornecedorRepository infoFornecedorRepository;

	public InfoFornecedor getFindByEstado(String estado) {
		return infoFornecedorRepository.findByEstado(estado);
	}

}
