package br;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in, "UTF-8");

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Digite o número da conta bancaria:");
        Integer numero = sc.nextInt();
        sc.nextLine();
        conta.setNumero(numero);

        System.out.println("Digite o número da Agência bancaria:");
        String agencia = sc.nextLine();
        conta.setAgencia(agencia);

        System.out.println("Digite o nome do cliente:");
        String nome = sc.nextLine();
        conta.setNomeCliente(nome);

        System.out.println("Digite o Saldo da Conta:");
        double saldo = sc.nextDouble();
        sc.nextLine();
        conta.setSaldo(saldo);


        System.out.println("------------------------------");
        System.out.println("Numero da Conta: " + conta.getNumero());
        System.out.println("Numero da Agencia: " + conta.getAgencia());
        System.out.println("Nome do Cliente: " + conta.getNomeCliente());
        System.out.println("Saldo da Conta: R$ " + conta.getSaldo());


        sc.close();
    }
}