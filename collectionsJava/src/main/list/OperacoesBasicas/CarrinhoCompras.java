package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> carrinho;

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade ){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removidosCarrinho = new ArrayList<>();

        for(Item i: carrinho){
            if (i.getNome().equalsIgnoreCase(nome)) {
                removidosCarrinho.add(i);
            }
        }
        carrinho.removeAll(removidosCarrinho);
    }
    public double calcularValorTotal(){
        double totalCarrinho=0;
        for(Item i: carrinho){
            totalCarrinho += i.getPreco()*i.getQuantidade();
        }
        return totalCarrinho;
    }
    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("arroz", 8, 2);
        carrinho.adicionarItem("feijão", 12, 3);
        carrinho.adicionarItem("batata frita", 24, 1);

        carrinho.exibirItens();
        System.out.println("Total de compras: R$" + carrinho.calcularValorTotal());

        carrinho.removerItem("BATATA FRITA");

        carrinho.exibirItens();
        System.out.println("Total de compras: R$" + carrinho.calcularValorTotal());
    }
}
