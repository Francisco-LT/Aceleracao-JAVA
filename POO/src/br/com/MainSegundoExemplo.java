package br.com;

import br.com.alunos.AlunoSegubdoEemplo;
import br.com.alunos.ValidationException;

public class MainSegundoExemplo {
    public static void main(String[] args) {
        AlunoSegubdoEemplo aluno1 = null;
        try {
            aluno1 = new AlunoSegubdoEemplo("ab", "12345678910", "francisco");
        } catch (ValidationException e) {
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
//        aluno1.setLogin("abc");
    }
}
