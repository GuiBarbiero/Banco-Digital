package main;

public class contaCorrente extends contaGenerica {
    
    public contaCorrente(NovoCliente cliente) {
        super (cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Aqui está o seu extrato da conta corrente!!");
        super.imprimirInfosComuns();

    }
}
