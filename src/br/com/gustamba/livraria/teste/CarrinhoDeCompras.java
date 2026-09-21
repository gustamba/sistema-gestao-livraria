package br.com.gustamba.livraria.teste;
import java.util.*;

import br.com.gustamba.livraria.produtos.Produto;

public class CarrinhoDeCompras {
    
    private double total;
    private List<Produto> produtos;
    
    public CarrinhoDeCompras(Produto[] produtos) {
        this.produtos = new ArrayList<Produto>();
    }

    public void adiciona(Produto produto) {
        this.produtos.add(produto);
    }

    public void remove(int posicao) {
        this.produtos.remove(posicao);
    }

    public double getTotal() {
        return total;
    } 

    public List<Produto> getProdutos() {
        return produtos;
    }
}