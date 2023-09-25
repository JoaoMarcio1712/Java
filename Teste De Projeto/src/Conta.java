import java.util.Random;

public class Conta {

	Cliente cliente = new Cliente();
	private static int conta = new Random().nextInt(1000, 3000);
	private static int agencia = new Random().nextInt(1, 99);
	private double saldo;
	private String tipoDeConta;

	public double getSaldo() {
		return saldo;
	}

	public static int getConta() {
		return conta;
	}

	public static int getAgencia() {
		return agencia;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Valor de saque maior que o saldo, tente novamente");
		}
	}

	public void transfere(double valor, Conta destino) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			destino.deposita(valor);
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

}