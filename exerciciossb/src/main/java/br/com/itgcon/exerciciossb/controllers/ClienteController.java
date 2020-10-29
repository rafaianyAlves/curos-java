package br.com.itgcon.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.itgcon.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping ("/qualquer")
	public Cliente obterCliente( ) {
		return new Cliente(12,"Rafaiany Alves","480.512.208-03");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id,"Esli Alves", "340.976.588-32");
	}
	
	@GetMapping
	public Cliente obterClientePorId2
	(@RequestParam(name="id") int id) {
		return new Cliente(id,"Evilyn Alves", "480.512.756-98");
	}
	

}
