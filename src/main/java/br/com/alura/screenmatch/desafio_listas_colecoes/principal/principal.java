package br.com.alura.screenmatch.desafio_listas_colecoes.principal;

import br.com.alura.screenmatch.desafio_listas_colecoes.compras.Compra;
import br.com.alura.screenmatch.desafio_listas_colecoes.formaDePagamento.CartaoCredito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        int sair = 1;
        List<String> comprasRealizadas = new ArrayList<>();

        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe o limite do cartão: ");
        double limitCartao = leitura.nextDouble();

        CartaoCredito cartaoCredito = new CartaoCredito(limitCartao);

        do {
            System.out.print("Digite a descrição da compra: ");
            String descricaoCompra = leitura.next();

            System.out.print("Digite o valor da compra: ");
            double valorCompra = leitura.nextDouble();

            Compra compra = new Compra(descricaoCompra, valorCompra);

            if (cartaoCredito.saldo() >= compra.getValorCompra()) {
                System.out.println(compra.calculaValorCompra(cartaoCredito, compra.getValorCompra()));
                comprasRealizadas.add(descricaoCompra);
            } else {
                System.out.println("Saldo indisponível");
                break;
            }

            System.out.print("Digite 0 para sair ou 1 para continuar: ");
            sair = leitura.nextInt();

            System.out.println("Saldo disponível: " + cartaoCredito.saldo());

        } while (sair != 0);

        for (String comprasConcluidas : comprasRealizadas) {
            System.out.println("Produtos: " + comprasConcluidas);
        }

        System.out.println("Agradecemos sua preferência, volte sempre!!!");
    }
}
