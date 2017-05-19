package Conta;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Luiz on 18/05/2017.
 */
public class ContaCorrente {
    public static void main(String[] args){

        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in)
        Random numero = new Random();
        int conta = 1 + numero.nextInt(100);
        int opcao;
        double valor;

        //Obtendo os dados iniciais do Cliente
        System.out.println("Cadastrando novo cliente.");
        System.out.print("Entre com seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();
        Operacao C = new Operacao(nome, conta, inicial);

        System.out.println("\t****************************");
        System.out.println("\t* Escolha a opção desejada *");
        System.out.println("*1 - Consultar Extrato       *");
        System.out.println("*2 - Sacar                   *");
        System.out.println("*3 - Depositar               *");
        System.out.println("*4 - Sair                    *\n");
        System.out.println("\t****************************");
        System.out.print("Opção: ");
        opcao = entrada.nextInt();
         do {
            switch( opcao ){
                case 1:
                    C.extrato();
                    break;
                case 2:
                    if(saques<3){
                        System.out.print("Quanto deseja sacar: ");
                        valor = entrada.nextDouble();
                        C.sacar(valor);
                    } else{
                        System.out.println("Limite de saques diários atingidos.\n");
                    }
                    break;

                case 3:
                    System.out.print("Quanto deseja depositar: ");
                    valor = entrada.nextDouble();
                    C.depositar(valor);
                    break;

                case 4:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=4);

    }
}