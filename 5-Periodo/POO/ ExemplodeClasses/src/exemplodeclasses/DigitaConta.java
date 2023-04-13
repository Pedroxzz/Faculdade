package exemplodeclasses;

import java.util.Scanner;

public class DigitaConta{
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        ContaPoupanca cp = new ContaPoupanca();

        System.out.println("Cadastro em Conta Poupança");
        
        System.out.print("\nNúmero da conta: ");
            cp.numeroConta = tc.nextInt();
        
        System.out.println("\nNúmero do cliente: ");
            cp.numeroCliente = tc.nextInt();
        
        System.out.println("\nData da abertura da conta: ");
            cp.dataAbertura = tc.next(); 
    }
}
