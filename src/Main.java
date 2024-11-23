import entidades.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        double saldo = 0;
        int numConta;

        System.out.print("Informe o número da conta: ");
        numConta = sc.nextInt();
        System.out.print("Informe o nome do titular da conta: ");
        sc.nextLine();//Usado para queimar a quebra de linha.
        nome = sc.next();
        sc.nextLine();
        System.out.println("Irá efetuar algum deposito (s/n)?: ");
        char response = sc.nextLine().charAt(0);
        if (response == 's') {
            System.out.print("Qual valor irá depositar: ");
            saldo = sc.nextDouble();
            Banco bc = new Banco(saldo);
            System.out.println("valor depositado: " + bc.getSaldo());

        }
        Banco bc = new Banco(nome, saldo, numConta);
        System.out.println("conta: ");
        System.out.println(bc.toString());
        System.out.println();
        System.out.print("Valor de deposito: ");
        double dep = sc.nextDouble();
        bc.deposito(dep);
        System.out.println("conta: ");
        System.out.println(bc.toString());

        System.out.println();
        System.out.print("valor de saque: ");
        double saq = sc.nextDouble();
        if (saq > saldo) {
            System.out.println("Saldo insuficiente para operação.");
        } else {
            bc.saque(saq);
            System.out.println("conta:");
            System.out.println(bc.toString());
        }
    }
}