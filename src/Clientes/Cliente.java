package Clientes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    public String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
