import java.util.Scanner;

public class condicionais {

    public static void saida() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("________________~<>~________________\n");        
        System.out.print("Digite 1 para sair: ");
        int aux = entrada.nextInt();
    }
    
    public static void condicionais(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.print("________________~<>~________________\n");
        System.out.println("   Exercícios de condicionais\n");
        System.out.println("0. Sair");
        System.out.println("1. Ex 1");
        System.out.println("2. Ex 2");
        System.out.println("3. Ex 3");
        System.out.println("4. Ex 4");
        System.out.println("5. Ex 5");
        System.out.println("6. Ex 6");
        System.out.println("7. Ex 7");
        System.out.println("8. Ex 8");
        System.out.print("________________~<>~________________\n");
        System.out.print("Opção: ");
    }

    public static void ex1(){
        System.out.print("\033[H\033[2J");  
        Scanner entrada = new Scanner(System.in);
        System.out.print("________________~<>~________________\n");
        System.out.print("Digite um número: ");
        int var = entrada.nextInt();
        if(var < 0) 
            System.out.print("É negativo\n");
        else 
            System.out.print("É positivo\n");

        saida();
    }

    public static void ex2(){
        System.out.print("\033[H\033[2J");  
        Scanner entrada = new Scanner(System.in);
        System.out.print("________________~<>~________________\n");
        System.out.println("Digite três números: ");
        int maior=0;
        int var1 = entrada.nextInt();
        int var2 = entrada.nextInt();
        int var3 = entrada.nextInt();

        if(var1 > var2 && var1 > var3) 
            maior = var1;
        if(var2 > var1 && var2 > var3) 
            maior = var2;
        if(var3 > var1 && var3 > var2) 
            maior = var3;

        System.out.println("O maior número é: " + maior);               

        saida();
    }

    public static void ex3(){
        System.out.print("\033[H\033[2J");  
        Scanner entrada = new Scanner(System.in);
        System.out.print("________________~<>~________________\n");
        System.out.print("Digite um número: ");
        int var = entrada.nextInt();

        if(var > 0) System.out.println("1");
        else if(var < 0) System.out.println("-1");
        else System.out.println("0"); 

        saida();
    }

    public static void ex4(){
        System.out.print("\033[H\033[2J");  
        Scanner entrada = new Scanner(System.in);
        System.out.print("________________~<>~________________\n");
        System.out.print("Digite um número: ");
        int var = entrada.nextInt();

        if(var == 1) System.out.println("Segunda-Feira");
        else if(var == 2) System.out.println("Terça-Feira");
        else if(var == 3) System.out.println("Quarta-Feira");
        else if(var == 4) System.out.println("Quinta-Feira");
        else if(var == 5) System.out.println("Sexta-Feira");
        else if(var == 6) System.out.println("Sábado");
        else if(var == 7) System.out.println("Domingo");

        saida();
    }

    public static void ex5(){
        System.out.print("\033[H\033[2J");  
        Scanner entrada = new Scanner(System.in);
        System.out.print("________________~<>~________________\n");
        System.out.print("Digite um mês: ");
        int mes = entrada.nextInt();
        System.out.print("Digite um ano: ");
        int ano = entrada.nextInt();
        String m="";
        int d=0;
        if(mes == 1) {
            m = "Janeiro";
            d = 31;
        }
        else if(mes == 2) {
            m = "Fevereiro";
            if (ano % 400 == 0) d = 29;
            else d = 28;
        }
        else if(mes == 3) {
            m = "Março";
            d = 31;
        }
        else if(mes == 4) {
            m = "Abril";
            d = 30;
        }
        else if(mes == 5) {
            m = "Maio";
            d = 31;
        }
        else if(mes == 6){
            m = "Junho";
            d = 30;
        }
        else if(mes == 7) {
            m = "Julho";
            d = 31;
        }
        else if(mes == 8) {
            m = "Agosto";
            d = 31;
        }
        else if(mes == 9) {
            m = "Setembro";
            d = 30;
        }
        else if(mes == 10) {
            d = 31;
            m = "Outubro";
        }
        else if(mes == 11) {
            m = "Novembro";
            d = 30;
        }
        else if(mes == 12) {
            d = 31;
            m = "Dezembro";
        }
        System.out.println(m + " de " + ano + " tem " + d + " dias.");
        saida();
    }

    public static void ex6(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        System.out.println("Digite a letra:"); 
        Scanner read = new Scanner(System.in); 
        String N=read.next();
        if(N.length() > 1){
            System.out.println("Insira apenas uma letra.");
            saida();
        }
        else {
            char c=N.charAt(0);
            switch(c){ 
                case'a': 
                case'e': 
                case'i': 
                case'o': 
                case'u': 
                    System.out.println("A letra "+N+" é uma vogal!"); 
                    break; 

                default: 
                System.out.println("A letra "+N+" é uma consoante!"); 
            } 
            saida();
        }
    }

    public static void ex7(){
        System.out.print("\033[H\033[2J");  
        Scanner entrada = new Scanner(System.in);
        System.out.print("________________~<>~________________\n");
        System.out.print("Digite um ano: ");
        int ano = entrada.nextInt();
        if(ano % 400 == 0)
            System.out.println(ano+" é bissexto!");
        else System.out.println(ano+" não é bissexto!");

        saida();
    }

    public static void ex8(){
        System.out.print("\033[H\033[2J");  
        Scanner entrada = new Scanner(System.in);
        System.out.print("________________~<>~________________\n");
        System.out.print("Os 10 primeiros números naturais: \n");
        int i;
        for(i = 1; i < 11; i++)
            System.out.print(i+" ");

        System.out.print("\n");
        saida();
    }
    
    
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            condicionais();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                ex1();
                break;
            case 2:
                ex2();
                break;
            case 3:
                ex3();
                break;
            case 4:
                ex4();
                break;
             case 5:
                ex5();
                break;
            case 6:
                ex6();
                break;
            case 7:
                ex7();
                break;
            case 8:
                ex8();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}