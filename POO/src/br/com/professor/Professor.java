package br.com.professor;

import br.com.usuarios.Usuario;
import br.com.alunos.ValidationException;

public class Professor extends Usuario {

    public Professor(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }
}
