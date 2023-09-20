package main;

import java.util.List;

public class banco {

    private String nome;
    private List <contaGenerica> contas;

    public List<contaGenerica> getContas() {
        return contas;
    }

    public void setContas(List<contaGenerica> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
