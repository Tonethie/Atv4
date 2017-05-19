package Conta;

import java.util.Scanner;

/**
 * Created by Luiz on 18/05/2017.
 */
public class Operacao extends ContaCorrente {
        private String nome;
        private int conta, saques;
        private double saldo;
        Scanner entrada = new Scanner(System.in);

        public Operacao(String nome, int conta, double saldo_inicial){
            super();
            this.nome=nome;
            this.conta=conta;
            saldo=saldo_inicial;
            saques=0;
        }

        public void extrato(){
            System.out.println("\tEXTRATO");
            System.out.println("Nome: " + this.nome);
            System.out.println("Número da conta: " + this.conta);
            System.out.printf("Saldo atual: %.2f\n",this.saldo);
            System.out.println("Saques realizados hoje: " + this.saques + "\n");

        }

        public void sacar(double valor){
            if(saldo >= valor){
                saldo -= valor;
                saques++;
                System.out.println("Sacado: " + valor);
                System.out.println("Novo saldo: " + saldo + "\n");
            } else {
                System.out.println("Saldo insuficiente. Faça um depósito\n");
            }
        }

        public void depositar(double valor)
        {
            saldo += valor;
            System.out.println("Depositado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        }
}
