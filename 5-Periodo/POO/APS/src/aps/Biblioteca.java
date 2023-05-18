package aps;

import java.util.Scanner;

public class Biblioteca {
    int qtdLivros = 100;

    void emprestarLivro(int qtd){
        qtdLivros -= qtd;
    }

    void devolverLivro(int qtd){
        qtdLivros += qtd;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int opcao;
        
        do {
            System.out.println("\n\n\t\t\t\t\tBiblioteca\n");
            System.out.println("Selecione a opção:  <1> para Criar conta    <2> para Livros   <0> para Sair:");
            opcao = s.nextInt(); 

            if (opcao == 1){
                CriarConta.main(args);
            }
            
        } while (opcao !=0);
            System.out.println("FIM DO PROGRAMA");
    }
}
