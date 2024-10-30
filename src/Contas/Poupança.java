package Contas;


import Clientes.Cliente;

public class Poupança extends Conta {

    public Poupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "Poupança{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
