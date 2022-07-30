package br.edu.unicesumar.escoladeti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unicesumar.escoladeti.domain.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

}