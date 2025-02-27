package main.list.Pesquisa;
import java.util.*;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int num){
        numeros.add(num);
    }
    public int calcularSoma(){
        int soma=0;
        for(Integer n: numeros){
            soma += n;
        }

        return soma;
    }
    public int encontrarMaiorNumero(){
        int maior=0;
        for(Integer n: numeros){
            if(n > maior){
                maior = n;
            }
        }
        return maior;
    }
    public int encontrarMenorNumero(){
        int menor=encontrarMaiorNumero();
        for(Integer n: numeros){
            if(n<menor){
                menor = n;
            }
        }
        return menor;
    }
    public String exibirNumeros(){
        return numeros.toString();
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(28);
        numeros.adicionarNumero(21);
        numeros.adicionarNumero(18);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(54);

        System.out.println(numeros.exibirNumeros());
        System.out.println(numeros.calcularSoma());
        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());
    }
}
