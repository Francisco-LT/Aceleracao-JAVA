package br.com.tarefas;

public class Tarefa {

    String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    //acima temos um construtor, que deixa tudo mais dinâmico, ele pede que recebamos um parâmetro
    public void exibirTarefa(){
        System.out.println(descricao);
    }
    public int obterTamanho() {
        return descricao.length();
    }
}
