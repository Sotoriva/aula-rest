package br.edu.unicesumar.aula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.edu.unicesumar.aula.domain.Curso;
import br.edu.unicesumar.aula.repository.CursoRepository;

@Service
public class CursoService {
  @Autowired
  CursoRepository cursoRepository;
  
  public Page<Curso> buscarCursos(Pageable page) {
    return cursoRepository.findAll(page);
  }

  public Curso criaCurso(Curso curso) {
    return cursoRepository.save(curso);
  }
}
