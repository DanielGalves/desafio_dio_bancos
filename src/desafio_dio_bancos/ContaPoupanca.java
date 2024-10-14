package desafio_dio_bancos;

public class ContaPoupanca extends Conta {

	
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	//Metodo para imprimir o extrato bancario
	public void imprimirExtrato() {
		System.out.println("==== Extrato Conta Poupanca ====");
		super.extracted();
		
		
	}

	@Override
	//Metodo para calcular valor de emprestimo para conta poupança
	public void emprestimo(double valor, int periodo) {
		valor  = valor +( valor * 0.12);
		
		super.extratoEmprestimo(valor);
		
	}

	
	
	

}
