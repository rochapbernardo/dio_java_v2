package main.list.Ordenacao;
import java.util.*;
public class OrdenacaoNumero{
    private List<Numero> numeros;

    public OrdenacaoNumero() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int num){
        numeros.add(new Numero(num));
    }
    public List<Numero> ordenarAscendente(){
        List<Numero> numerosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }
    public List<Numero> ordenarDescendente(){
        List<Numero> numeroDescendente = new ArrayList<>(numeros);
        Collections.sort(numeroDescendente, Collections.reverseOrder());
        return numeroDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumero numero = new OrdenacaoNumero();

        numero.adicionarNumero(10);
        numero.adicionarNumero(25);
        numero.adicionarNumero(3);
        numero.adicionarNumero(12);
        numero.adicionarNumero(45);
        numero.adicionarNumero(1);
        numero.adicionarNumero(2);
        numero.adicionarNumero(32);

        System.out.println(numero.ordenarAscendente());
        System.out.println(numero.ordenarDescendente());

    }

}
