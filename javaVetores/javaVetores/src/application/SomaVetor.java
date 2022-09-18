package application;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros vc vai digitar?: ");
       
         int n = sc.nextInt();
        
        double[] vetor = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um numero: ");
            vetor[i] = sc.nextInt();
          
        }
        
        System.out.println();
        System.out.printf("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i]);
        }
       

        double sum = 0.0;
       
        for (int i = 0; i < n; i++) {
            
            sum += vetor[i];
            
        }

        System.out.printf("SOMA %.2f%",sum);

        double avg = sum/n;
        System.out.printf("MEDIA: %.2f% ", avg);
      
        
         

    sc.close();        
    }
}
