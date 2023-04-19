package br.com.gerenciaescola.gerenciaescola;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByNome(String nome);
    Aluno findByMatricula(String matricula);
}

