package aps;

public class Pessoa {
    
    String nome, endereco, dataNascimento, genero;
    int limiteEsprestimo;
    Long telefone;
    
    /*void novaPessoa(){
        nome = "Joseph Joestar";
        endereco = "Rua dos Candelabros, 200";
        dataNascimento = "25-04-1989";
        telefone = 119548464987l;
    }*/

    Pessoa(String nome, int limite){
        this.nome = nome;
        this.limiteEsprestimo = limite;
    }
    
    Pessoa(){
        
    }
    

}
