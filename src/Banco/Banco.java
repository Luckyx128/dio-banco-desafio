package Banco;

import Clientes.Cliente;
import Contas.Conta;
import Contas.Corrente;
import Contas.Poupança;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Getter
@Setter
public class Banco {
    public String nome;
    private List<Conta> contas = new ArrayList<>();

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas.size() +
                '}';
    }

    public Banco(String nome){
        this.nome = nome;
    }

    public Conta criarConta(String conta, Cliente cliente){
        Conta novaConta = null;
        if (conta == "corrente"){
            novaConta = new Corrente(cliente);
        } else if (conta == "poupança") {
            novaConta = new Poupança(cliente);
        }
        contas.add(novaConta);
        return novaConta;
    }

    public List<Conta> listarContas(){
        return contas;
    }
    public Conta contaCliente(Cliente cliente){
        Optional<Conta> contaOp = contas.stream().filter(conta1 -> conta1.getCliente().equals(cliente) ).findFirst();
        Conta conta = null;
        if (contaOp.isPresent()){
            conta = contaOp.get();
        }
            return conta;
    }

    public void usarConta(Cliente cliente,String acao,long valor,Conta contaDestino){
        Optional<Conta> conta = contas.stream().filter(conta1 -> conta1.getCliente().equals(cliente) ).findFirst();
        if(conta.isPresent()){
            if (acao == "sacar"){
                conta.get().sacar(valor);
            }else if (acao == "depositar"){
                conta.get().depositar(valor);
            }else if (acao == "transf" && contaDestino != null){
                conta.get().transferir(valor,contaDestino);
            }
            System.out.println(conta.get());
        }
    }
}
