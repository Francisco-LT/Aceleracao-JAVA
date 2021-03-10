package br.com;

import br.com.alunos.Aluno;
import br.com.alunos.ValidationException;
import br.com.disciplinas.Disciplina;
import br.com.disciplinas.LimiteAlunosAlcancadoException;
import br.com.professor.Professor;
import br.com.usuarios.Usuario;
import br.com.usuarios.repositorios.RepositorioUsuario;

public class Main {
    public static void main(String[] args) {
        RepositorioUsuario repositorio = new RepositorioUsuario();
        try {
            Professor professor = new Professor("professor", "12345678910", "edson");
            Aluno aluno= new Aluno("professor", "12345678910", "Francisco");

            repositorio.add(professor);
            repositorio.add(aluno);
            repositorio.findAll().stream().forEach(System.out::println);
//            Disciplina disciplina = new Disciplina("matemática", professor);
//            for (int i = 0; i < 9; i++) {
//                disciplina.matricular(new Aluno("aluno", "12345678910", "Francisco" + i));
//            }
//            disciplina.mostrarAlunos();
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
