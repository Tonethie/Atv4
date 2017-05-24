package Conta;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class OP extends ContaCorrente {
	private int valor, tipo, saldoinicial;
	int x;
	Scanner in = new Scanner(System.in);
	public OP(int saldo){
		this.saldoinicial=saldo;

		Date minhaData = new Date();;
		Calendar calendar = Calendar.getInstance();  
		calendar.setTime(minhaData);
		calendar.add(Calendar.DAY_OF_MONTH, x);
		System.out.println("Data:" + calendar.getTime());
		
	do{
		System.out.println("********************************");
		System.out.println("*Qual operação deseja realizar:*");
		System.out.println("*1)Saque                       *");
		System.out.println("*2)Deposito                    *");
		System.out.println("*3)Sair                        *");
		System.out.println("********************************");
		System.out.println("4 - Incrementar data");
		tipo=in.nextInt();
		switch (tipo){
			case 1:
				System.out.println("Informe o valor de saque:");
				valor=in.nextInt();
				saldoinicial -= valor;
				System.out.println("Sacado: " + valor);
	            System.out.println("Novo saldo: " + saldoinicial + "\n");
	            break;
			case 2:
				System.out.println("Informe o valor do deposito:");
				valor=in.nextInt();
				saldoinicial += valor;
				System.out.println("Depositado: " + valor);
	            System.out.println("Novo saldo: " + saldoinicial + "\n");
	            break;
			case 3:
				System.out.println("Sistema encerrado!");
				break;
			case 4:
				x=1;
				calendar.add(Calendar.DAY_OF_MONTH, x);
				System.out.println("Data:" + calendar.getTime());
				break;
			}
		} while (tipo!=4);
	}
}
