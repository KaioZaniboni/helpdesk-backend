package br.com.zaniboni.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zaniboni.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
