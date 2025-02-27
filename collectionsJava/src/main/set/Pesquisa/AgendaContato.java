package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;
    
    public AgendaContato(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Camila", 1111);
        agendaContato.adicionarContato("Camila", 0);
        agendaContato.adicionarContato("Camila Cavalcante", 12345);
        agendaContato.adicionarContato("Camila DIO", 78965);
        agendaContato.adicionarContato("Bernardo Rocha", 45623);

        agendaContato.exibirContato();
        System.out.println(agendaContato.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContato.atualizarNumeroContato("Bernardo Rocha", 27997));
    }
}
