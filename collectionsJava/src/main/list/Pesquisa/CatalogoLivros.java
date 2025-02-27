package main.list.Pesquisa;
import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(l);
                }
            }
        }
        return livrosAutor;
    }
    public List<Livro> pesquisarIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosIntervalo = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosIntervalo.add(l);
                }
            }
        }
        return livrosIntervalo;
    }

    public Livro pesquisarTitulo(String titulo){
        Livro livroTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroTitulo = l;
                    break;
                }
            }
        }
        return livroTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Origem", "DAN BROWN", 2017);
        catalogoLivros.adicionarLivro("Game of Thrones, vol. 1", "GEORGE R. R. MARTIN", 1996);
        catalogoLivros.adicionarLivro("Inferno", "DAN BROWN", 2013);

        System.out.println(catalogoLivros.pesquisarAutor("Dan Brown"));
        System.out.println(catalogoLivros.pesquisarIntervaloAno(1990, 2000));
        System.out.println(catalogoLivros.pesquisarTitulo("Inferno"));
    }
}
