package br.usjt.hellospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.hellospringboot.model.Temperatura;
import br.usjt.hellospringboot.repository.TemperaturasRepository;

@Service
public class TemperaturasService {

	@Autowired
	private TemperaturasRepository temperaturasRepo;
	
	public List<Temperatura>listarTodos(){
			return temperaturasRepo.findAll();
	}

}
