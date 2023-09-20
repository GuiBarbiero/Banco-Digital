package main;
//não precisa ter public por ser uma interface é irrelevante
public interface inter {
    void saque( double valor);

    void depositar(double valor);

    void transferir(double valor, contaCorrente contaDestino );

    void imprimirExtrato();

}
