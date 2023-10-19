package br.com.alura.viacep.principal;

import br.com.alura.viacep.api.CEPJson;
import br.com.alura.viacep.api.PesquisaCEP;
import br.com.alura.viacep.cep.CEP;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int opcoes = 1;
        String endereco = "";

        CEP cep = new CEP();
        PesquisaCEP pesquisaCEP = new PesquisaCEP();
        CEPJson cepJson = new CEPJson();

        while (opcoes != 0) {
            System.out.print("Digite 1 para pesquisa ou 0 para sair: ");
            opcoes = leitura.nextInt();

            if (opcoes == 1) {
                System.out.print("Informe o CEP desejado: ");
                endereco = leitura.next();

                String url = cep.retornaCEP(endereco);
                System.out.println(pesquisaCEP.consultaAPI(url));
                cepJson.gerarJSON(pesquisaCEP.consultaAPI(url));
            }else if (opcoes == 0) {
                System.out.println("Ate a proxima");
                break;
            } else {
                System.out.println("Numero invalido");
            }
        }

        System.out.println("Programa finalizado com sucesso!!");
    }
}
