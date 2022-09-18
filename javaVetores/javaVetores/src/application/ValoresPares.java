package application;

import java.util.Scanner;
import java.util.Locale;


public class ValoresPares {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

      
        System.out.println("Quantos numeros vc vai digitar?: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for(int i=0; i<n; i++){
            
            System.out.printf("Digite um numero:");
            vetor[i] = sc.nextInt();

           
          
        }
        System.out.println("NUMEROS PARES: ");
        
        int quantdPares = 0;
        for(int i=0; i<n; i++){
          
            if(vetor[i] % 2 == 0){
             
                System.out.println(vetor[i]);
                quantdPares++;
            }
        }

    System.out.printf("quantidade de pares: %d\n ",quantdPares);
        sc.close();
    }
}
    

