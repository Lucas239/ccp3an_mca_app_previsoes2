package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.hellospringboot.model.Temperatura;

public interface TemperaturasRepository extends JpaRepository<Temperatura,String>{

}
