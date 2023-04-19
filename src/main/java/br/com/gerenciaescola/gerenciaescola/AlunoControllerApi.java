package br.com.gerenciaescola.gerenciaescola;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoControllerApi {
    @Autowired
    private AlunoRepository alunoRepository;
    
    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }
    
    @PostMapping
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno) {
        Aluno novoAluno = alunoRepository.save(aluno);
        return new ResponseEntity<>(novoAluno, HttpStatus.CREATED);
    }
    
    // outros métodos do controlador, como atualizar, excluir, etc.
}

