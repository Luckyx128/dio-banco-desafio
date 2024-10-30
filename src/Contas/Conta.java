package Contas;
import Clientes.Cliente;
import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    private static long sequencial = 1;
    private static final long agenciaPadrao = 22;

    protected long agencia;
    protected long numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.agenciaPadrao;
        this.numero = sequencial++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
            this.sacar(valor);
            contaDestino.depositar(valor);
    }
}
