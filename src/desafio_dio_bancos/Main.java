package desafio_dio_bancos;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Daniel");
		
		Conta cc = new ContaCorrente(cliente);
		cc.depositar(1000);
		
		
		Conta poupanca = new ContaPoupanca(cliente);
		
		
		//cc.transferir(350, poupanca);
		
		
		//cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
		
		//cc.sacar(500);
		//cc.imprimirExtrato();

		//poupanca.emprestimo(1000, 2);
		
		cc.investimento.calculaInvestimento(1, 1000);
	}

}
