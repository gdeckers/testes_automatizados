package com.github.gdeckers.negocio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;


public class GerenciadoraClientesTest_01 {
    @Test
    public void testPesquisaCliente() {

        // criando alguns clientes
        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", true, 1);
        Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", true, 2);

        // inserindo os clientes criados na lista de clientes do banco
        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        GerenciadoraCliente gerClientes = new GerenciadoraCliente(clientesDoBanco);

        Cliente cliente = gerClientes.pesquisaCliente(1);

        assertEquals(cliente.getId(), 1);
        assertEquals(cliente.getEmail(),"gugafarias@gmail.com");

    }
}
