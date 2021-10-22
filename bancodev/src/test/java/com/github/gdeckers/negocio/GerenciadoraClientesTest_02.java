package com.github.gdeckers.negocio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;


public class GerenciadoraClientesTest_02 {
    static GerenciadoraCliente gerClientes;

    @BeforeEach
    public void setUp() {
        // criando alguns clientes
        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", true, 1);
        Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", true, 2);

        // inserindo os clientes criados na lista de clientes do banco
        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        gerClientes = new GerenciadoraCliente(clientesDoBanco);
    }



    @Test
    public void testPesquisaCliente() {



        Cliente cliente = gerClientes.pesquisaCliente(1);

        assertEquals(cliente.getId(), 1);
        assertEquals(cliente.getEmail(),"gugafarias@gmail.com");

    }
}
