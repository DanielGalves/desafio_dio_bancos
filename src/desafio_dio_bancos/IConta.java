package desafio_dio_bancos;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);	
	
	void transferir(double valor,Conta contaDestino);
	
	void emprestimo(double valor,int periodo);
	
	void imprimirExtrato();

}
