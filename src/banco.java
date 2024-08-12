package src;

import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        String nome = "Isaac jesus";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;
        String Menu = """
                ** Digite sua opção **
                1-Consulta saldo
                2-Transferir valor
                3-Receber Valor
                4- Sair
                                
                """;
        System.out.println("***************************************");
        System.out.println("\nNome do cliente" + nome);
        System.out.println("Tipo conta :" + tipoConta);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("\n***************************************");

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(Menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor do que deseja tranferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar tranferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo:" + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}