package com.github.gdeckers.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static GerenciadoraCliente gerCliente;

    public static void main(String[] args){

        iniciasistema();

        Scanner sc = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            printMenu();
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o ID do Cliente: ");
                    int idCliente = sc.nextInt();
                    Cliente cliente = gerCliente.pesquisaCliente(idCliente);

                    if(cliente != null){
                        System.out.println(cliente.toString());
                    }
                    pulalinha();
                    break;

                case 2:
                    System.out.println("Espere um pouco...");
                    List<Cliente> clientes = gerCliente.getClientesBanco();
                    System.out.println(clientes.toString());
                    pulalinha();
                    break;

                case 3:
                    System.out.println("Digite o ID do Cliente: ");
                    int idCliente1 = sc.nextInt();
                    Cliente cliente1 = gerCliente.pesquisaCliente(idCliente1);

                    if (cliente1 != null) {
                        cliente1.setAtivo(true);
                    }
                    pulalinha();
                    break;

                case 4:
                    System.out.println("Digite o ID do Cliente: ");
                    int idCliente2 = sc.nextInt();
                    Cliente cliente2 = gerCliente.pesquisaCliente(idCliente2);

                    if (cliente2 != null) {
                        cliente2.setAtivo(false);
                    }
                    pulalinha();
                    break;

                case 5:
                    continua = false;
                    System.out.println("################# Sistema encerrado #################");
                    break;

                default:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
            }


        }





    }

    private static void pulalinha() {
        System.out.println("\n");
    }

    private static void printMenu() {

        System.out.println("O que voc?? deseja fazer? \n");
        System.out.println("1) Consultar por um cliente");
        System.out.println("2) Consultar por uma conta corrente");
        System.out.println("3) Ativar um cliente");
        System.out.println("4) Desativar um cliente");
        System.out.println("5) Sair");
        System.out.println();

    }

    private static void iniciasistema() {
        List<Cliente> clientesBanco = new ArrayList<>();

        Cliente cliente1 = new Cliente(1, "John Doe", 90, "john@acme.com", true, 1);
        Cliente cliente2 = new Cliente(2, "Tony Stark", 99, "tony@stark.com", true, 2);

        clientesBanco.add(cliente1);
        clientesBanco.add(cliente2);

        gerCliente = new GerenciadoraCliente(clientesBanco);
    }
}
