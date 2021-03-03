package br.com;

import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListaTarefas;
import br.com.tarefas.Tarefa;

public class Principal {

    public static void main(String [] args) {

//        ArrayTarefas tarefas = new ArrayTarefas(3);

        ListaTarefas tarefas = new ListaTarefas();

//        Tarefa tarefa1 = new Tarefa("regar plantas logo depois da hora da janta") ;
//        Tarefa tarefa2 = new Tarefa("comer");
//        Tarefa tarefa3 = new Tarefa("dormir ");

//        tarefas.adicionar(tarefa1);
        tarefas.adicionar("comer");
        tarefas.adicionar("dormir");

        System.out.println("Minhas tarefas");
        System.out.println("--------------");
        Tarefa tarefa = tarefas.buscar("comer");
        tarefas.exibirTarefas();
//        System.out.println("o tamanho da tarefa é de " + tarefa1.getSize() + " caracteres");

//        tarefas.remover(tarefa1);

//        System.out.println("Minhas tarefas após remover");
//        System.out.println ("--------------");
//        tarefas.exibirTarefas();
    }

}
