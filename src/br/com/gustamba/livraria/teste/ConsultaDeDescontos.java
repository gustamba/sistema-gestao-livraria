package br.com.gustamba.livraria.teste;

public class ConsultaDeDescontos {

    public static void main(String[] args) {
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
        
        if(gerenciador.validaCupom("CUP1234")){
            System.out.println("Cupom de desconto válido.");
        } else {
            System.out.println("Esse cupom não existe.");
        }
    }

}
