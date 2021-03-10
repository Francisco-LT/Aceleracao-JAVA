package br.com.disciplinas;

import br.com.alunos.Aluno;
import br.com.professor.Professor;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    private static final byte LIMITE = 10;

    public void matricular(Aluno aluno) throws LimiteAlunosAlcancadoException{
        if(this.alunos.size() < LIMITE) {
            this.alunos.add(aluno);
        }else{
            throw new LimiteAlunosAlcancadoException("Limite de alunos atingido, que é: " + LIMITE);
        }
    }
    public void mostrarAlunos (){
        this.alunos.stream().forEach(aluno -> System.out.println(aluno.getNome()));
    }

}
