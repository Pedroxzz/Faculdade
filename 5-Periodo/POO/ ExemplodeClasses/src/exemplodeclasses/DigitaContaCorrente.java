package exemplodeclasses;

import java.util.Scanner;

public class DigitaContaCorrente {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        ContaCorrente cc;

        System.out.println("Cadastro em Conta Corrente");
        
        do{
            cc = new ContaCorrente();
            System.out.print("\nNúmero da conta: ");
                cc.numeroConta = tc.nextInt();
                if (cc.numeroConta != 0) {
                System.out.println("\nNúmero do cliente: ");
                    cc.numeroCliente = tc.nextInt();
                System.out.println("\nData da abertura da conta: ");
                    cc.dataAbertura = tc.next(); 
                System.out.println("\nDigite o código do gerente: ");
                    cc.gerente = tc.nextInt();
                System.out.println("\nDigite o valor do limite de crédito: ");
                    cc.limite = tc.nextDouble();
                System.out.println("\nDigite o valor da taxa mensal: ");
                    cc.limite = tc.nextDouble();
                System.out.println("\nDigite o valor do depósito: ");
                    cc.depositoConta(tc.nextDouble());
                System.out.println("\nDigite o valor do saque: ");
                    cc.saqueConta(tc.nextDouble());
                System.out.println("O Saldo atual em conta corrente é: "+cc.saldo);    
                }
        }while (cc.numeroConta != 0);
    }
    
}
