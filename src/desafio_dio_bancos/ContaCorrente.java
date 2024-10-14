package desafio_dio_bancos;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}
	
	@Override
	//metodo para imprimir o extrato bancario
	public void imprimirExtrato() {
		System.out.println("==== Extrato Conta Corrente ====");
		super.extracted();		
		
	}
	
	
	//Metodo para calcular calor do emprestimo para conta corrente
	public void emprestimo(double valor, int periodo) {
		valor  = valor +( valor * 0.18);		
		super.extratoEmprestimo(valor);		
		
	}
	
	
	
	

}
