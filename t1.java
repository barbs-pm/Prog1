/*************************
*	BÁRBARA P. MARKUS    *
*	github.com/barbs-pm  *
*		UFFS/CC          *
*	                     *
*	CONTA DE BANCO JAVA  *
**************************/


import java.util.Scanner;

class Conta {
	int num;
	double saldo, lim, valor;
	String nome;

	void saca(double valor){
		System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.print("___________________~<>~___________________\n");
        System.out.println("         Banco Bárbara Top (BBT)\n\n");
		if(this.saldo < valor) 
			System.out.println("Você não possui saldo suficiente.");
		else {
			saldo -= this.valor;
			System.out.println("\nSaque efetuado com sucesso!");
			System.out.println("O saldo da sua conta agora é: "+this.saldo);
		}
	}

	void deposita(double valor){
		System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.print("___________________~<>~___________________\n");
        System.out.println("         Banco Bárbara Top (BBT)\n\n");
		this.saldo += valor;
		System.out.println("\nDeposito efetuado com sucesso!");
		System.out.println("O saldo da sua conta agora é: "+this.saldo);
	}

	void calculaRendimento(){
		double juro;
		juro = this.saldo * 2/100 + this.saldo;
		System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.print("___________________~<>~___________________\n");
        System.out.println("         Banco Bárbara Top (BBT)\n\n");
		System.out.println("Seu saldo ao final do mês será de: "+juro);
	}

	void extrato(){
		System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.print("___________________~<>~___________________\n");
        System.out.println("         Banco Bárbara Top (BBT)\n\n");
		System.out.println("Seu saldo é de: "+this.saldo);
	}
}

public class t1 {
    public static void saida() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("___________________~<>~___________________\n");        
        System.out.print("Aperte enter para efetuar outra operação");
        String aux = entrada.nextLine();
    }

    public static void senhor(Conta c1){
		Scanner entrada = new Scanner(System.in);
		String nome;
		int num;

		System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.print("___________________~<>~___________________\n");
        System.out.println("         Banco Bárbara Top (BBT)\n\n");
        System.out.println("Boa tarde!"); 
       	System.out.print("Digite seu nome: ");
        c1.nome = entrada.nextLine();
       	System.out.print("Digite sua conta: ");
        c1.num = entrada.nextInt();
        System.out.print("___________________~<>~___________________\n");
	}

	public static void t1(Conta c1){
		System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.print("___________________~<>~___________________\n");
        System.out.println("         Banco Bárbara Top (BBT)\n\n");
        System.out.println("  Olá, "+c1.nome+"!     conta: "+c1.num+"\n");
        System.out.println("0. Sair");
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Calcular rendimentos (2% ao mês)");
        System.out.println("4. Extrato");
        System.out.print("___________________~<>~___________________\n");
        System.out.print("Opção: ");
	}

	public static void main(String[] args) {
        int opcao;
        double valor;
        Scanner entrada = new Scanner(System.in);
        Conta c1 = new Conta();
        senhor(c1);
        
        do{
            t1(c1);
            opcao = entrada.nextInt();

            switch(opcao){
            case 1:
	            System.out.print("Valor: ");
	            c1.valor = entrada.nextDouble();
                c1.saca(c1.valor);
                saida();
                break;
            case 2:
	            System.out.print("Valor: ");
	            c1.valor = entrada.nextDouble();
                c1.deposita(c1.valor);
                saida();
                break;
            case 3:
                c1.calculaRendimento();
                saida();
                break;
            case 4:
                c1.extrato();
                saida();
                break;
            case 0:
            	break;           
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}