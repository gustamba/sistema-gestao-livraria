package br.com.gustamba.livraria.teste;
import java.util.Comparator;
import br.com.gustamba.livraria.produtos.Livro;

/**
 * ComparadorPorNome
 */
public class ComparadorPorNome implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getNome().compareTo(l2.getNome());
    }


}
