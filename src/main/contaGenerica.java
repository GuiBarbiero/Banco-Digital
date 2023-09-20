package main;

public abstract class contaGenerica implements inter {

    protected static int PADRAO = 0001;
    protected static int SEQUENCIAL = 1;

        protected int agencia;
        protected int numeroBancario;
        protected double saldoAtual;
        protected NovoCliente cliente;
    //Não desejo que ela seja final pois será sequencial, podendo assim gerar uma valor sequencial automatico
    
    public contaGenerica(NovoCliente cliente) {
        this.agencia = contaGenerica.PADRAO;
        this.numeroBancario = SEQUENCIAL++; //O ++ é para subirmos a sequencia
        this.cliente = cliente;
    }

//Getters
        public int getAgencia() {
            return agencia;
        }
    
        public int getNumeroBancario() {
            return numeroBancario;
        }
    
        public double getSaldoAtual() {
            return saldoAtual;
        }
    
        protected void imprimirInfosComuns() {
             System.out.println(String.format("Titular: %s", this.cliente.getNome()));
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numeroBancario));
            System.out.println(String.format("Saldo: %.2f", this.saldoAtual));
        }
    
//implementado metodos da classe abstrata
        @Override
        public void depositar(double valor) {
           saldoAtual = saldoAtual + valor; 
            
        }

        @Override
        public void saque(double valor) {
             saldoAtual = saldoAtual - valor; 
            
        }

        @Override
        public void transferir(double valor, contaCorrente contaDestino) { // usei o this para melhor entendimento do saque.
             this.saque(valor);
             contaDestino.depositar(valor);
        
            
        }

        public void cliente(NovoCliente cliente2) {
        }
    }
    
