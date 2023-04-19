package br.com.gerenciaescola.gerenciaescola;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @OneToMany(mappedBy = "aluno")
    private List<Nota> notas;
    
    @OneToMany(mappedBy = "aluno")
    private List<Frequencia> frequencias;
    
    // getters e setters
}