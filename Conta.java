import java.sql.Date;

class Conta {
	private double saldo;
	private String numero;
	private String senha;
	private Transacao[] historico;
	
	public boolean efetuarSaque(double valor){
		return false;
		
	}
	
	public boolean efetuarDeposito(double valor){
		return false;
		
	}
	public boolean efetuarPagamento(String boleto, double valor){
		return false;
		
	}
	
	public Transacao[] extrato(Date inicio, Date fim){
		return null;
		
	}
	
}

class Transacao{
	private double valor;
	private Date data;
}

class Pagamento extends Transacao{
	private String boleto;
}
class Deposito extends Transacao{
	
}
class saque extends Transacao{
	
}

class CaixaEletronico{
	public Conta autentica(String numeroConta, String senha){
		return null;
		
	}
}


