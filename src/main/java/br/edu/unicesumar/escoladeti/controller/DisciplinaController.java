package br.edu.unicesumar.escoladeti.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.Pageable;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import br.edu.unicesumar.escoladeti.domain.Disciplina;
// import br.edu.unicesumar.escoladeti.repository.DisciplinaRepository;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {
    
    // @Autowired
    // private DisciplinaRepository disciplinaRepository;
    
    // @GetMapping
	// public ResponseEntity<Page<Curso>> buscarCursoPaginado(Pageable pageable) {
	// 	return ResponseEntity.ok(cursoService.buscarCursoPaginado(pageable));
	// }
	
	// @GetMapping("/{id}")
	// public ResponseEntity<Curso> buscarCursoPorId(@PathVariable(name = "id") Long id){
	// 	Optional<Curso> CursoOpt = cursoService.obterCursoPorId(id);
		
	// 	if(CursoOpt.isPresent()) {
	// 		return ResponseEntity.ok(CursoOpt.get());
	// 	}
		
	// 	return ResponseEntity.notFound().build();
	// }
	
	// @DeleteMapping("/{id}")
	// public ResponseEntity<Void> deletarCursoPorId(@PathVariable(name = "id") Long id){
	// 	Optional<Curso> CursoOpt = cursoService.obterCursoPorId(id);
		
	// 	if(CursoOpt.isPresent()) {
	// 		cursoService.deletarCursoPorId(id);
	// 		return ResponseEntity.ok().build();
	// 	}
		
	// 	return ResponseEntity.notFound().build();
	// }
	
	// @PostMapping
	// public ResponseEntity<Curso> salvarCurso(@RequestBody Curso Curso) {
	// 	return ResponseEntity.ok(cursoService.salvarCurso(Curso));
	// }
	
	// @PutMapping("/{id}")
	// public ResponseEntity<Curso> atualizarCurso(@PathVariable(name = "id") Long id, @RequestBody Curso Curso){
	// 	return ResponseEntity.ok(cursoService.atualizarCurso(Curso));
	// }

}
