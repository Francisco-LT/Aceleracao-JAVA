package br.com;

public class MainProcedural {
    public static void main(String[] args) {
        String loginAluno = "nome";
        if(validateLogin(loginAluno, "nome")) {
            System.out.println("Login válido");
        }else {
            System.out.println("Login inválido");
        }
    }
    private static boolean validateLogin(String login, String primeiroNome) {
        return login != null && !login.isEmpty() && login.length() < 20 && login.contains(primeiroNome);
    }
}
//Esse exemplo não está orientado a objetos