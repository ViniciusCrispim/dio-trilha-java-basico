package org.ViniciusCrispim;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor insira os dados da conta a seguir");
        System.out.println("Digite o número da conta: ");
        var numeroConta = input.nextInt();
        input.nextLine();
        System.out.println("Digite o número da agencia: ");
        var agencia = input.next();
        System.out.println("Digite o seu nome: ");
        var nomeCliente = input.next();
        System.out.println("Digite o saldo para depósito: ");
        var saldo = input.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.\nSua agência é: %s. \nConta: %d.\nSeu saldo: R$ %.2f já está disponível para saque!",
                nomeCliente, agencia, numeroConta, saldo);

    }
}