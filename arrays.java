import java.util.Scanner;
import java.util.Random;

public class arrays {

    public static void saida() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("________________~<>~________________\n");        
        System.out.print("Aperte enter para sair");
        String aux = entrada.nextLine();
    }
    
    public static void arrays(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.print("________________~<>~________________\n");
        System.out.println("   Exercícios de arrays\n");
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
        System.out.println("11. Ex 11");
        System.out.print("________________~<>~________________\n");
        System.out.print("Opção: ");
    }

    public static void ex1(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        
        int[][] matriz = new int[3][3];
        int soma=0;
            
        Scanner entrada = new Scanner(System.in);
        System.out.println("Matriz M[3][3]\n");
        
        for(int linha=0 ; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                matriz[linha][coluna]=entrada.nextInt();
            }
        }
        
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        System.out.println("\nA Matriz: \n");
        for(int linha=0 ; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                System.out.printf("  %d  ",matriz[linha][coluna]);
                soma += matriz[linha][coluna];
            }
            System.out.println();
        }
        System.out.println("\nA soma da matriz é: " + soma);
                
        
        saida();
    }

    public static void ex2(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");

        for(int i=0 ; i < 20 ; i++){
            for(int j = 0; j < 20 ; j ++){
                if(i % 2 == 0) System.out.print(" ");
                else System.out.print("-");
            } 
            System.out.println();
        }
        saida();
    }

        public static void ex3(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        
        int[][] matriz = new int[3][3];
        int media=0;
            
        Scanner entrada = new Scanner(System.in);
        System.out.println("Matriz M[3][3]\n");
        
        for(int linha=0 ; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                matriz[linha][coluna]=entrada.nextInt();
            }
        }
        
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        System.out.println("\nA Matriz: \n");
        for(int linha=0 ; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                System.out.printf("  %d  ",matriz[linha][coluna]);
                media += matriz[linha][coluna];
            }
            System.out.println();
        }
        System.out.println("\nA media da matriz é: " + (media/9));
                
        
        saida();
    }

    public static void ex4(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");        
        int[][] matriz = new int[3][3];
        int cot=0;
            
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("\nDiga um número de 1 a 20: ");
        int num = entrada.nextInt();

        
        for(int linha=0 ; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                matriz[linha][coluna]=  random.nextInt(20);
                System.out.printf("  %d  ",matriz[linha][coluna]);
            }
            System.out.println();
        }

        for(int linha=0 ; linha < 3 ; linha++)
            for(int coluna = 0; coluna < 3 ; coluna ++)
                if(num == matriz[linha][coluna]){
                    System.out.printf("\nVocê adivinhou! Está na posição [%d][%d].\n", linha+1, coluna+1);
                    cot=1;
                    break;  
                }
                     
               if(cot == 0) System.out.printf("\nVocê não achou :(\n");           

        saida();
    }

    public static void ex5(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        Random random = new Random();
        
        int[] array = {1,2,3,4,5};
        int remove, i, j;
        int tam = array.length;

        for(i = 0; i < tam; i++)
            System.out.printf(" %d ", array[i]);
            
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDeseja apagar qual elemento? ");
        remove = entrada.nextInt();
        System.out.printf("\n");


        for(i = 0; i < tam; i++){
            if(array[i] == remove){
                for(j = i; j < tam - 1; j++){
                    array[j] = array[j+1];
                }
            }
        }

        for(i = 0; i < tam - 1; i++)
            System.out.printf(" %d ", array[i]);

        System.out.printf("\n");
        saida();
    }

    public static void ex6(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        Random random = new Random();

        int insere, i, j, pos;
        
        int[] array = new int[5];
        int tam = array.length;

        for(i = 0; i < tam; i++){
            array[i] = random.nextInt(20);
            System.out.printf(" [%d] ", array[i]);
        }
            
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\nDeseja inserir qual elemento? ");
        insere = entrada.nextInt(); 
        System.out.print("Em qual posição (0-5)? ");
        pos = entrada.nextInt();

        int[] array1 = new int[6];

        for(i = 0; i < tam + 1; i++){
            if(i < pos)
                array1[i] = array[i];
            
            else if(i == pos)
                array1[i] = insere;
            
            else
                array1[i] = array[i-1];
            
        }

        System.out.println();
        for(j = 0; j < tam + 1; j++)
            System.out.printf(" [%d] ", array1[j]);

        System.out.printf("\n");
        saida();
    }    

    public static void ex7(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        Random random = new Random();

        
        int[] array = new int[5];
        int tam = array.length;
        int i;
        for(i = 0; i < tam; i++){
            array[i] = random.nextInt(20);
            System.out.printf(" [%d] ", array[i]);
        }
            
        int maior=array[0], menor=array[0];

        for(i = 1; i < tam; i++)
            if(maior < array[i])
                maior = array[i];
       
        for(i = 1; i < tam; i++)
            if(menor > array[i])
                menor = array[i];

        System.out.printf("\n\nMaior = [%d]", maior);
        System.out.printf("\nMenor = [%d]", menor);

        System.out.printf("\n");
        saida();
    }
    
    public static void ex8(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        Random random = new Random();

        int[] array = new int[5];
        int tam = array.length;
        int i, impar=0, par=0;
        for(i = 0; i < tam; i++){
            array[i] = random.nextInt(20);
            System.out.printf(" [%d] ", array[i]);
        }

        for(i = 0; i < tam; i++){
            if(array[i] % 2 == 0) par++;
            else impar++;
        }

        System.out.printf("\nPares = %d", par);
        System.out.printf("\nÍmpares = %d", impar);

        System.out.printf("\n");
        saida();
    }
    
    public static void ex9(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        Random random = new Random();

        int[] array = new int[5];
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int tam = array.length;
        int i, j;

        for(i = 0; i < tam; i++){
            array[i] = random.nextInt(20);
            System.out.printf(" [%d] ", array[i]);
        }
        System.out.printf("\n");

        for(i = 0; i < tam; i++){
            array1[i] = random.nextInt(20);
            System.out.printf(" [%d] ", array1[i]);
        }
        
        System.out.printf("\n");

        for(i = 0; i < tam; i++){
            for(j = 0; j < tam; j++){
                if(i == j)
                    array2[i] = array1[j] * array[i];
           }
        }

        System.out.printf("\n");
        for(i = 0; i < tam; i++){
            System.out.printf(" [%d] ", array2[i]);
        }

        System.out.printf("\n");
        saida();
    }    
    public static void ex10(){
        System.out.print("\033[H\033[2J");  
        System.out.print("________________~<>~________________\n");
        Random random = new Random();

        int[] array = new int[5];
        
        int tam = array.length;
        int i, aux, aux2;

        for(i = 0; i < tam; i++){
            array[i] = random.nextInt(20);
            System.out.printf(" [%d] ", array[i]);
        }

        aux = array[0];
        array[0] = array[4];
        array[4] = aux;

        System.out.printf("\n");

        for(i = 0; i < tam; i++)
            System.out.printf(" [%d] ", array[i]);  

        System.out.printf("\n");
        saida();
    }

    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            arrays();
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