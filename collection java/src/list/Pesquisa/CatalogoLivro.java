package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    listPorAutor.add(l);
                }
            }
        }
        return listPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()){
          for(Livro l: livroList){
              if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                  listIntervaloAnos.add(l);
              }
          }
        }
        return  listIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) throws Exception{
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                   return l;
                }
            }
        }
        throw new Exception("O livro mencionado não foi encontrado na lista");
    }

    static void main(String[] args) throws Exception {
        CatalogoLivro catalogoLivros = new CatalogoLivro();

        catalogoLivros.adicionarLivro("Harry Potter e as relíqueas da morte", "J.K. Rowling",2020);
        catalogoLivros.adicionarLivro("Harry Potter e a pedra filosofal", "J.K. Rowling",2021);
        catalogoLivros.adicionarLivro("Star Wars 1", "George Lucas",2022);
        catalogoLivros.adicionarLivro("Star Wars 2", "George Lucas",2023);
        catalogoLivros.adicionarLivro("Crepusculo", "Não sei",1994);
        catalogoLivros.adicionarLivro("Crepusculo", "Não sei",2014);

        System.out.println(catalogoLivros.pesquisarPorAutor("J.K. Rowling"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Star Wars 2"));

    }

}
