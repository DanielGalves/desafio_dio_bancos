package desafio_dio_bancos;

public abstract class Conta implements IConta{
	
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;	
	
	
	Investimento investimento = new Investimento();
	
	
	public Conta(Cliente cliente){
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL ++;
		this.cliente = cliente;
		
		
	}	
	
	
	@Override
	// Metodo para sacar
	public void sacar(double valor) {
		
		if(saldo <= valor) {
			System.out.println("Saldo insuficiente!");
		} else {
			saldo -= valor;
		}
		
	}

	@Override
	// Metodo para depositar
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	//Metodo para trasferir
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	//Metodo para imprimir as informações da conta
	protected void extracted() {		
		
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Nome: %s", this.cliente.getNome()));
		System.out.println(String.format("Saldo %.2f", this.saldo));
	}
	
	protected void extratoEmprestimo(double valor) {
		System.out.println("==== Extrato do Emprestimo ====");
		System.out.println(String.format("Valor solicitado: R$ %.2f  ",valor));
		System.out.println(String.format("Valor a pagar:  R$ %.2f", valor));
	}
	
	
	
	
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
