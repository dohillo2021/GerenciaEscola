package br.com.gerenciaescola.gerenciaescola;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "materias")
public class Materia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private Professor professor;
    
    @OneToMany(mappedBy = "materia")
    private List<Nota> notas;
    
    @OneToMany(mappedBy = "materia")
    private List<Frequencia> frequencias;
    
    // getters e setters
}

