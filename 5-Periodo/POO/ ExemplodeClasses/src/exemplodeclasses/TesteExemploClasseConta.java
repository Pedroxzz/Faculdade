package exemplodeclasses;

public class TesteExemploClasseConta {
    public static void main(String[] args) {

        Conta contaObj = new Conta();
        contaObj.saqueConta(500);

        System.out.println("O valor do saldo é: "+contaObj.saldo);
    }
}
