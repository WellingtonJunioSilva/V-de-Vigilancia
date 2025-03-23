package Abertura_do_pedido.Abertura_do_pedido;

import Abertura_do_pedido.Abertura_do_pedido.Conta.Motoboy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pedido> pedidos = new ArrayList<>();

        // Criando motoboys disponíveis
        Motoboy motoboy1 = new Motoboy("Carlos Silva", "123.456.789-00", "9999-9999", "ABC-1234");
        Motoboy motoboy2 = new Motoboy("Mariana Souza", "987.654.321-00", "8888-8888", "XYZ-9876");

        System.out.println("🚀 Bem-vindo ao Sistema de Delivery! 🚀");

        while (true) {
            System.out.println("\n1. Criar Novo Pedido");
            System.out.println("2. Listar Pedidos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do Cliente: ");
                String nome = scanner.nextLine();
                System.out.print("CPF do Cliente: ");
                String cpf = scanner.nextLine();
                System.out.print("Telefone do Cliente: ");
                String telefone = scanner.nextLine();
                System.out.print("Endereço do Cliente: ");
                String endereco = scanner.nextLine();

                System.out.print("Peso da Mercadoria (Kg): ");
                double peso = scanner.nextDouble();
                System.out.print("Distância (Km): ");
                double distancia = scanner.nextDouble();
                System.out.print("Tempo Estimado (min): ");
                double tempo = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("\nEscolha um Motoboy:");
                System.out.println("1. " + motoboy1.getNome());
                System.out.println("2. " + motoboy2.getNome());
                System.out.print("Opção: ");
                int escolha = scanner.nextInt();
                scanner.nextLine();

                Motoboy motoboySelecionado = (escolha == 1) ? motoboy1 : motoboy2;
                Cliente cliente = new Cliente(nome, cpf, telefone, endereco);
                Pedido novoPedido = new Pedido(cliente, motoboySelecionado, peso, distancia, tempo);

                pedidos.add(novoPedido);
                System.out.println("\n✅ Pedido Criado com Sucesso!\n");
                System.out.println(novoPedido.detalhesPedido());

            } else if (opcao == 2) {
                System.out.println("\n📦 Lista de Pedidos:");
                for (Pedido pedido : pedidos) {
                    System.out.println(pedido.detalhesPedido());
                    System.out.println("----------------------");
                }

            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema...");
                break;
            }
        }
        scanner.close();
    }
}
