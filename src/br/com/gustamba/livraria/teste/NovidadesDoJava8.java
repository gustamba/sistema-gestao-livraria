package br.com.gustamba.livraria.teste;
import br.com.gustamba.livraria.*;
import br.com.gustamba.livraria.produtos.*;
import java.util.*;

public class NovidadesDoJava8 {

    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java O.O.");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Prático");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        List<Livro> livros = Arrays.asList(javaoo, java8, ruby);

        //Collections.sort(livros, new ComparadorPorNome());

        /*
        livros.sort(new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                return l1.getNome().compareTo(l2.getNome());
            }
        });
        */

        livros.sort(
            (l1, l2) -> l1.getNome().compareTo(l2.getNome())
        );

        // livros.sort(comparing(l -> l.getNome()));

        for (Livro livro : livros) {
            System.out.println(livro.getNome());
        }
        
        livros.stream()
        .filter(l -> l.getNome().contains("Java"))
        .forEach(l -> System.out.println(l.getNome()));   

    }

}
