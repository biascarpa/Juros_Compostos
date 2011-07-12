import java.util.Scanner;

public class JurosCompostos {
	
	public static void main(String args[])
	{
		
		double juros;
		double saldo;
		double prest = 138.3;
		double prazo = 48;
		int avista = 2500;
		
		juros = (Math.pow(((prazo * prest) / avista), 1/prazo) - 1) * 100;
		
		System.out.printf("Juros cobrados: %.2f ao mês", juros);
		
		saldo = (prest * (prazo - 20)) / Math.pow((1 + (juros/100)), prazo - 20);
		
		System.out.printf("\nSaldo a ser quitado: R$ %.2f", saldo);
		
		System.exit(0);
		
	}
	

}
