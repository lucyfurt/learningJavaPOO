package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        
        System.out.println("Digite um numero: ");
        for(int i=0; i<n; i++){
                       
            vetor[i] = sc.nextDouble();
        }
        
        System.out.println("MEDIA DO VETOR: ");
        double soma = 0;
       for(int i=0; i<n; i++){
         
         soma = soma + vetor[i];
                        
        }
        double media = soma/n;
        System.out.println(media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i <n; i++) {
           if (vetor[i]< media) {
            System.out.printf("%.1f\n", vetor[i]);
            
           } 
        }
       sc.close();
    }

    }

