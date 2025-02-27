package main.list.Ordenacao;
import java.util.*;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }
    public List<Pessoa> ordenarAltura(){
        List<Pessoa> pessoasAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasAltura, new ComparatorAltura());
        return pessoasAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Anderson", 33, 1.90);
        ordenacaoPessoa.adicionarPessoa("Bernardo", 23, 1.73);
        ordenacaoPessoa.adicionarPessoa("Giovanna", 20, 1.73);
        ordenacaoPessoa.adicionarPessoa("Vitor", 14, 1.80);
        ordenacaoPessoa.adicionarPessoa("Ananias", 54, 1.70);

        System.out.println(ordenacaoPessoa.ordenarIdade());
        System.out.println(ordenacaoPessoa.ordenarAltura());

    }
}
