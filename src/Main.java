import Banco.Banco;
import Clientes.Cliente;
import Contas.Conta;

public class Main {
    public static void main(String[] args) {
        Banco nu = new Banco("NUBANK");
        Banco inter = new Banco("INTER");

        Cliente lucas = new Cliente("Lucas de Amorim");

        nu.criarConta("corrente",lucas);
        inter.criarConta("poupança",lucas);


        System.out.println(nu);
        System.out.println(nu.listarContas());
        Conta minhaConta = nu.contaCliente(lucas);

        System.out.println(inter);

        inter.usarConta(lucas,"depositar",10,null);
        inter.usarConta(lucas,"sacar",5,null);
        inter.usarConta(lucas,"transf",5,minhaConta);
        System.out.println(minhaConta);

    }
}