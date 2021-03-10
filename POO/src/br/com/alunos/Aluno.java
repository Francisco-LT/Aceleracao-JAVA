package br.com.alunos;

import br.com.usuarios.Usuario;

public class Aluno extends Usuario {

    private Integer numeroMatricula;

    public Aluno(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }
}
