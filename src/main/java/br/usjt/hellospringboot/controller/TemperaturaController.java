package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Temperatura;
import br.usjt.hellospringboot.repository.TemperaturasRepository;

import br.usjt.hellospringboot.service.TemperaturasService;

@Controller
public class TemperaturaController {
	//@Autowired
	//private TemperaturasRepository temperaturasRepo;
	
	@Autowired
	private TemperaturasService temperaturasService;



@Controller
public class TemperaturaController1 {
	@Autowired
	private TemperaturasRepository temperaturasRepo;
	

	@GetMapping("/temperaturas")
	public ModelAndView listarTemperaturas() {
		
		ModelAndView mv = new ModelAndView("lista_temperaturas");

		List<Temperatura> temperaturas = temperaturasService.listarTodos();

		List<Temperatura> Temperaturas = temperaturasRepo.findAll();

		

		mv.addObject("temperaturas", temperaturas);
		mv.addObject(new Temperatura());
		
		return mv;
	}



	@PostMapping("/temperaturas")
	public String salvar(Temperatura temperatura) {
		temperaturasRepo.save(temperatura);
		return "redirect:/alunos";
	}


}
}
