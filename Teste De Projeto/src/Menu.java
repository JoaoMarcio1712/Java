import java.util.Scanner;

public class Menu {

	static Scanner input = new Scanner(System.in);
	static int opcao;
	static Conta conta1 = new Conta();
	static Conta conta2 = new Conta();
	static double valor = 0;
	
	private static void inicializacao() {
		System.out.println("*************************************************");
		System.out.println("************" + " BEM VINDO AO ProgBank " + "************");
		System.out.println("*************************************************");
	}
	
	private static void dadosConta() {
		System.out.println("*************************************************");		
		System.out.println("Dados do cliente:");
		System.out.println("\nNome:             " + conta1.cliente.getNomeDoCliente());
		System.out.println("Tipo de conta:    " + conta1.getTipoDeConta());
		System.out.println("Saldo atual:    " + "R$ " + conta1.getSaldo());
		System.out.println("\n************************************************");
	}

	private static void mensagem() {
		System.out.println("Operações:");
		System.out.println("\n1- Sacar");
		System.out.println("2- Depositar");
		System.out.println("3- Transferir");
		System.out.println("4- Extrato");
		System.out.println("5- sair");
		System.out.println("");
		System.out.println("Selecione a opção desejada:");
		opcao = input.nextInt();
	}

	public static void main(String[] args) {

		conta1.cliente.setNomeDoCliente("Paulo");
		conta1.setTipoDeConta("Corrente");
		conta2.cliente.setNomeDoCliente("Monica");

		conta1.deposita(4000.00);
		conta2.deposita(1500.00);

		inicializacao();
		
		dadosConta();
		
		mensagem();

		while (opcao != 5) {
			switch (opcao) {
				case 1: {
					System.out.println("Digite o valor desejado para saque: ");
					conta1.saca(valor= input.nextInt());
					System.out.println("*************************************************");
					System.out.println("Saque realizado com sucesso!");
					System.out.println("Saldo Atualizado: R$ " + conta1.getSaldo());
					System.out.println("*************************************************");
					mensagem();
				}
				case 2: {
					System.out.println("Digite o valor desejado para Depósito: ");
					conta1.deposita(valor = input.nextInt());
					System.out.println("*************************************************");
					System.out.println("\nDepósito feito com sucesso!");
					System.out.println("Saldo Atualizado: R$ " + conta1.getSaldo());
					System.out.println("\n*************************************************");
					mensagem();
				}
				case 3: {
					System.out.println("Digite o valor desejado para transferencia: ");
					conta1.transfere(valor  = input.nextInt(), conta2);
					System.out.println("*************************************************");
					System.out.println("Transferencia feita com sucesso!");
					System.out.println("Saldo Atualizado: R$ " + conta1.getSaldo());
					System.out.println("*************************************************");
					mensagem();
				}
				case 4: {
					dadosConta();
					mensagem();
				}
				case 5: {
					break;
				}

				default:
					System.out.println("Opção invalida.. tente novamente");
					opcao = input.nextInt();
			}
		}
		System.out.println("O ProgBank agradece a preferencia, volte sempre!");
	}
}
