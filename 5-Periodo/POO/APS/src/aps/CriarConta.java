package aps;

import java.util.Scanner;

public class CriarConta {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao = 0;

        Pessoa p1 = new Pessoa();

        System.out.println("Cadastro:\n");
            
        System.out.println("Digite seu nome:");
            p1.nome = s.nextLine();
        System.out.println("Digite seu endereço: ");
            p1.endereco = s.nextLine();
        System.out.println("Digite sua data de nascimento: ");
            p1.dataNascimento = s.nextLine();
        System.out.println("Digite seu gênero: ");
            p1.genero = s.nextLine();
        System.out.println("Digite seu telefone:");
            p1.telefone = s.nextLong();

    }

}
