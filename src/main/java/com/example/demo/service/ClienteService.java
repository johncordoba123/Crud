package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Cliente;

@Service
public class ClienteService {

	// ListadoClientes

	private List<Cliente> clientes;

	public ClienteService() {
		clientes = new ArrayList<>();
		clientes.add(new Cliente(1, "John", "Cordoba", "1031640658"));
		clientes.add(new Cliente(2, "Natalia", "Andrea", "10225468"));
		clientes.add(new Cliente(3, "Juan", "Ortega", "55416589"));
	}

	public List<Cliente> List() {
		return clientes;
	}

	// BuscarCliente

	public Cliente find(int id) {
		for (Cliente cliente : clientes) {
			if (cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
	}
	// CrearCliente

	public Cliente save(Cliente cli) {
		clientes.add(cli);
		return cli;
	}

	// ActualizarCliente

	public Cliente update(int id, Cliente cli) {
		int index = 0;
		for (Cliente l : clientes) {
			if (l.getId() == id) {
				cli.setId(id);
				clientes.set(index, cli);
			}
		}
		return cli;
	}

	// EliminarCliente

	public boolean delete(int id) {
		for (Cliente c : clientes) {
			if (c.getId() == id) {
				return clientes.remove(c);
			}
		}
		return false;
	}

}
