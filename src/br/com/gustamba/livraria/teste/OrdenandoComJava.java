package br.com.gustamba.livraria.teste;

import br.com.gustamba.livraria.Autor;
import br.com.gustamba.livraria.produtos.*;
import java.util.*;

public class OrdenandoComJava {

    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Java 8 Prático");
        fisico.setValor(59.90);

        Ebook ebook  = new Ebook(autor);
        ebook.setNome("Java 8 Prático");
        ebook.setValor(29.90);

        List<Produto> produtos = Arrays.asList(fisico, ebook);

        Collections.sort(produtos);

        for (Produto produto : produtos) {
            System.out.println(produto.getValor());
        }

    }

}
