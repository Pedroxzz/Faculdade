package exemplodeclasses;

import java.util.Scanner;

public class DigitaContaPoupanca{
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        ContaPoupanca cp;

        System.out.println("Cadastro em Conta Poupança");

        do {
            cp = new ContaPoupanca();
            System.out.print("\nNúmero da conta: ");
                cp.numeroConta = tc.nextInt();
                if(cp.numeroConta != 0){
                    System.out.println("\nNúmero do cliente: ");
                        cp.numeroCliente = tc.nextInt();
                    System.out.println("\nData da abertura da conta: ");
                        cp.dataAbertura = tc.next(); 
                    System.out.println("\nDatas de aniversário da conta poupança: ");
                        cp.datasAniversarios = tc.next();
                    System.out.println("\nDigite o valor do depósito: ");
                        cp.depositoConta(tc.nextDouble());
                    System.out.println("\nDigite o valor do saque: ");
                        cp.saqueConta(tc.nextDouble());
                    System.out.println("O Saldo atual é: "+cp.saldo);
                }
        }while (cp.numeroConta != 0);

    }
}
