import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.spi.ToolProvider.findFirst;

public class Agenda {
    Scanner s = new Scanner(System.in);

    public List<Contato> c = new ArrayList<>();

    public List<Contato> getContatos(){
        if(c.isEmpty()){
            System.out.println("A lista está vazia!");
        }
        return c;
    }

    public void adicionaContato(Contato contato){
        c.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void excluirContato(String nome){
        if(c.contains(nome)){
            System.out.println("Este contato não está na agenda!");
        } else{
            c.removeIf(c -> c.getNome().equals(nome));
            System.out.println("Contato removido com sucesso!");
        }
    }

    public Contato pesquisarContato(String nomePesquisado){
        return c.stream()
                .filter(contato -> contato.getNome().equals(nomePesquisado))
                .findFirst()
                .orElse(null);
    }

    public void editarContato(Contato contato){

    }
}
