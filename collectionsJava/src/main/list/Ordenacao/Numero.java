package main.list.Ordenacao;

public class Numero implements Comparable<Numero>{
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int compareTo(Numero n) {
        return Integer.compare(numero, n.getNumero());
    }

    public int getNumero() {
        return numero;
    }

    public String toString() {
        return "Numero: " + numero;
    }
    
}
