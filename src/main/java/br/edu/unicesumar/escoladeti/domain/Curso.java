package br.edu.unicesumar.escoladeti.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {

    @Id
    @GeneratedValue(generator = "my_seq")
    @SequenceGenerator(name = "my_seq", sequenceName = "seq_curso_id", allocationSize = 1)
    private Long id;
    private String nome;
    @Column(name = "carga_horaria_minima")
    private int cargaHorariaMinima;
    @Column(name = "carga_horaria_maxima")
    private int cargaHorariaMaxima;
    @Column(name = "aprovado_em")
    private LocalDate aprovadoEm;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "curso_id")
    private List<Disciplina> disciplinas = new ArrayList<>();

}
