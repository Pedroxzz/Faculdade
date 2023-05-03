package exemplodeclasses;

import java.util.Scanner;

public class MenuDigitaConta {
    public static void main(String[] args) {    
    Scanner tc = new Scanner(System.in);        
    int opcao;

    do {
        System.out.println("\n\n\t\t\t\t\tCadastro da conta\n");
        System.out.println("Selecione o Tipo de Conta:  <1> para Corrente    <2> para Poupança   <0> para Sair:");
        opcao = tc.nextInt(); 
        if (opcao == 1) {
            DigitaContaCorrente.main(args);
        }else if (opcao == 2) {
            DigitaContaPoupanca.main(args);
        }else if (opcao != 0) {
            System.out.println("Opção Inválida");
        }
    } while (opcao!=0);
    System.out.println("FIM DO PROGRAMA");

    }
}
