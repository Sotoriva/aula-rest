package br.edu.unicesumar.escoladeti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unicesumar.escoladeti.domain.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}