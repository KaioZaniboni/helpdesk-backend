package br.com.zaniboni.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zaniboni.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
