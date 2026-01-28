package Residencia.MVC.Exerc01.src.service;

import Residencia.MVC.Exerc01.src.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();
    private int contadorId = 0;

    //Metodo Criar Cliente
    public boolean criarCliente(String nome, String email, String telefone, String cpf){
        for (Cliente c : clientes) {
            if (c.getEmail().equalsIgnoreCase(email)) {
                return false;
            }
        }

        if (!nome.isEmpty() && !email.isEmpty() && !telefone.isEmpty() && !cpf.isEmpty() && cpf.length() == 11){
            contadorId++;
            Cliente clienteCriado = new Cliente(contadorId, nome, email, telefone, cpf);
            clientes.add(clienteCriado);
            return true;
        }
        else {
            return false;
        }
    }

    //Metodo Listar Clientes
    public List<Cliente> listarClientes(){
        return clientes;
    }

    //Metodo Atualizar Cliente
    public boolean atualizarCliente(int id, int atributo, String novoValor){
        for (Cliente c : clientes){
            if (c.getId() == id && !novoValor.isEmpty()){
                switch (atributo) {
                    case 1:
                        c.setNome(novoValor);
                        break;
                    case 2:
                        if (!c.getEmail().equalsIgnoreCase(novoValor)) {
                            c.setEmail(novoValor);
                        }
                        break;
                    case 3:
                        c.setTelefone(novoValor);
                        break;
                    case 4:
                        if(novoValor.length() == 11){
                            c.setCpf(novoValor);
                        }
                        break;
                }
                return true;
            }
        }
        return false;
    }

    //Metodo Remover Cliente
    public boolean removerCliente(int id){
        for (Cliente c : clientes){
            if (c.getId() == id){
                clientes.remove(c);
                return true;
            }
        }
        return false;
    }

    //Metodo Consultar Cliente
    public boolean consultarCliente(int id){
        for (Cliente c : clientes){
            if (c.getId() == id){
                System.out.println(c);
                return true;
            }
        }
        return false;
    }
}
