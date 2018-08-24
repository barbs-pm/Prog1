import java.util.Scanner;
import java.util.Random;

public class basiquinho {

    public static void saida() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n________________~<>~________________\n");        
        System.out.print("Aperte enter para sair");
        String aux = entrada.nextLine();
    }
    
    public static void basiquinho(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.print("________________~<>~________________\n");
        System.out.println("   Exercícios Básicos\n");
        System.out.println("0. Sair");
        System.out.println("1. Ex 1");
        System.out.println("2. Ex 2");
        System.out.println("3. Ex 3");
        System.out.println("4. Ex 4");
        System.out.println("5. Ex 5");
        System.out.println("6. Ex 6");
        System.out.println("7. Ex 7");
        System.out.println("8. Ex 8");
        System.out.println("9. Ex 9");
        System.out.println("10. Ex 10");
        System.out.print("________________~<>~________________\n");
        System.out.print("Opção: ");
    }

    public static void ex1(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        System.out.println("Hello");
        System.out.println("Bárbara Pegoraro Markus");
    
        saida();
    }

    public static void ex2(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = entrada.nextInt();
        int soma = num1 + num2;

        System.out.printf("A soma deles é: %d\n", soma);

        saida();
    }

    public static void ex3(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = entrada.nextInt();
        int div = num1 + num2;

        System.out.printf("A divisão deles é: %d\n", div);

        saida();
    }

    public static void ex4(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");

        int a = -5 + 8 * 6;
        int b = (55 + 9)% 9;
        int c = 20 + -3 * 5/8;
        int d = 5 + 15/3 * 2 - 8% 3;

        System.out.println("A = "+a+"\nB = "+b+"\nC = "+c+"\nD = "+d);

        saida();
    }

    public static void ex5(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = entrada.nextInt();
        int mult = num1 * num2;

        System.out.printf("A multiplicação deles é: %d\n", mult);

        saida();
    }

    public static void ex6(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = entrada.nextInt();
        int a = num1 + num2;
        int b = num1 - num2;
        int c = num1 * num2;
        int d = num1 / num2;
        float e = num1 % num2;

        System.out.println(num1+" + "+num2+" = "+a);
        System.out.println(num1+" - "+num2+" = "+b);
        System.out.println(num1+" * "+num2+" = "+c);
        System.out.println(num1+" / "+num2+" = "+d);
        System.out.println(num1+" % "+num2+" = "+e);

        saida();
    }    

    public static void ex7(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();

        for(int i = 1; i < 11; i++)
            System.out.println(num1+" * "+(i)+" = "+(num1*i));

        saida();
    }
    
    public static void ex8(){
        System.out.print("\033[H\033[2J");  
        System.out.println("________________~<>~________________\n");
        System.out.println();
        System.out.println("   J       a       v     v     a");
        System.out.println("   J      a a       v   v     a a");
        System.out.println("   J     aaaaa       v v     aaaaa");
        System.out.println(" JJ    aa    aa       V     aa   aa ");

        saida();
    }
    
    public static void ex9(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        double soma = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.print("((25,5 * 3,5 - 3,5 * 3,5) / (40,5 - 4,5)) = "+soma);
        saida();
    }    
    
    public static void ex10(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        double soma = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.print("4,0 * (1 - (1,0 / 3) + (1,0 / 5) - (1,0 / 7) + (1,0 / 9) - (1,0 / 11)) = "+soma); 
        saida();
    }

    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            basiquinho();
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
            case 9:
                ex9();
                break;
            case 10:
                ex10();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}