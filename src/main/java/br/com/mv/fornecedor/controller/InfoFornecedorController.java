package br.com.mv.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mv.fornecedor.model.InfoFornecedor;
import br.com.mv.fornecedor.service.InfoFornecedorService;

@RestController
@RequestMapping("/info")
public class InfoFornecedorController {

	@Autowired
	private InfoFornecedorService infoFornecedorService;

	@GetMapping("/{estado}")
	public InfoFornecedor getFindByEstado(@PathVariable String estado) {
		return infoFornecedorService.getFindByEstado(estado);
	}
}
