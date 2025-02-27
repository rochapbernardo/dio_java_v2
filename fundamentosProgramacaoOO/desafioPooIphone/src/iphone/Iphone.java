package iphone;
import iphone.aparelhoTelefonico.AparelhoTelefonico;
import iphone.navegadorInternet.NavegadorInternet;
import iphone.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void ligar(String numero){
        System.out.println("Realizando chamada!");
    }
    public void atender(){
        System.out.println("Chamada atendida");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio eletrônico");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }
    public void exibirPagina(String url){
        System.out.println("Acesso a página com sucesso");
    }
    public void tocarMusica(){
        System.out.println("Tocando Música!");
    }
    public void pausarMusica(){
        System.out.println("Música pausada.");
    }
    public void selecionarMusica(String Musica){
        System.out.println("Música selecionada");
    }
}
