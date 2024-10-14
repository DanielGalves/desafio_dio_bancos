package desafio_dio_bancos;

public class Investimento {

	int periodo;
	double valorInvestido;
	double retornoInvestimento;
	final double taxa = 1.5;
	
	
	Investimento(int periodo, double valorInvestido) {
		this.periodo = periodo;
		this.valorInvestido = valorInvestido;
	}
	
	Investimento(){
		
	}
	
	
	public void calculaInvestimento(int periodo, double valorInvestido) {
		
		retornoInvestimento = valorInvestido + ((valorInvestido *(taxa/100) * periodo));
		
		System.out.println("==== Extrato de Investimento ====");
		System.out.println(String.format("Valor Investido %.2f", valorInvestido));
		System.out.println(String.format("Periodo Investido %d", periodo));
		System.out.println(String.format("Valor a receber no fim do periodo: R$%.2f", retornoInvestimento ));
		
		
	}
	
	
}
