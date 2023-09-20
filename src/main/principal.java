package main;

public class principal {



    public static void main(String[] args) {
        // exemplo de nome da conta
        NovoCliente guilherme = new NovoCliente();
            guilherme.setNome("Guilherme");

        contaGenerica conta = new contaCorrente(guilherme);
        contaGenerica poupanca = new contaPoupansa(guilherme);

        conta.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
