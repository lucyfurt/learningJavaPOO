package application;

import java.util.Locale;
import java.util.Scanner;

public class DoisVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();

        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        int[] vetor3 = new int[n];
        System.out.println("Digite os valores do vetor A:");
        for(int i=0; i<n; i++){
            
            
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for(int i=0; i<n; i++){
            
            
            vetor2[i] = sc.nextInt();

           
          
        }
        System.out.println("VETOR RESULTANTE: ");

       for(int i=0; i<n; i++){
        vetor3[i] = vetor1[i]  + vetor2[i];
        System.out.println(vetor3[i]);        
        }
     
       sc.close();
    }
    }

