package br.com.gerenciaescola.gerenciaescola;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "frequencias")
public class Frequencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Boolean presente;
    
    @Column(nullable = false)
    private LocalDate data;
    
    @ManyToOne
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materia;
    
    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;
    
    // getters e setters
}
