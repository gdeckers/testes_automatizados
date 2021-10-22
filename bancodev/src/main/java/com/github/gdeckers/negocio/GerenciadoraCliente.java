package com.github.gdeckers.negocio;

import java.util.List;

public class GerenciadoraCliente {

    private List<Cliente> clientesBanco;
    public GerenciadoraCliente(List<Cliente> clientesBanco) {
        this.clientesBanco = clientesBanco;
    }

    public List<Cliente> getClientesBanco() {
        return clientesBanco;
    }

    public Cliente pesquisaCliente (int idCliente) {

        for (Cliente cliente : clientesBanco) {
            if(cliente.getId() == idCliente)
                return cliente;
        }
        return null;
    }

    public void adicionaCliente(Cliente novoCliente) {
        clientesBanco.add(novoCliente);
    }

    public boolean removeCliente(int idCliente) {
        boolean clienteRemovido = false;

        for(int i=0; i < clientesBanco.size(); i++){
            Cliente cliente = clientesBanco.get(i);
            if (cliente.getId() == idCliente){
                System.out.println(cliente.toString());
            }
        }
        return clienteRemovido;
    }



}
