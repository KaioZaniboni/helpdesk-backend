package br.com.zaniboni.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zaniboni.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
