package br.com.gustamba.livraria.teste;

import br.com.gustamba.livraria.produtos.Produto;

public class CarrinhoDeCompras {
    
    private double total;
    private Produto[] produtos;
    private int contador = 0;
    
    public CarrinhoDeCompras(Produto[] produtos) {
        this.produtos = produtos;
    }

    public void adiciona(Object object) {
        System.out.println("Adicionando: " + object);
        this.produtos[contador] = (Produto) object;
        contador ++;
        Produto moldado = (Produto) object;
        this.total += moldado.getValor();
    }

    public void remove(int posicao) {
        this.produtos[posicao] = null;
    }

    public double getTotal() {
        return total;
    } 

    public Produto[] getProdutos() {
        return produtos;
    }
}