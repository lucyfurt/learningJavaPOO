package application;

import java.util.Locale;
import java.util.Scanner;

public class NegativosVetor {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Quantos numeros vc vai digitar?: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for(int i=0; i<n; i++){
            
            System.out.printf("Digite um numero:");
            vetor[i] = sc.nextInt();

           
          
        }
        System.out.println("NUMEROS NEGATIVOS: ");

        for(int i=0; i<n; i++){
            if(vetor[i] < 0 ){
                System.out.printf("%d\n", vetor[i]);
            }
        }
          
       

        
        sc.close();
    }
}
