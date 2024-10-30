package Contas;


import Clientes.Cliente;

public class Corrente extends Conta {

    public Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "Corrente{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}

