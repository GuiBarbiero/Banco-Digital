package main;

public class contaPoupansa extends contaGenerica {
    public contaPoupansa(NovoCliente cliente) {
        super(cliente);
    }

   
    @Override
    public void imprimirExtrato() {
       System.out.println("Aqui está o seu extrato da conta poupansa!!");
        super.imprimirInfosComuns();
    }
   
}
