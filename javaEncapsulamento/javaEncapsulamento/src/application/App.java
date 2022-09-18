package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc;

        Locale.setDefault(Locale.US);

        System.out.println("Enter account number: ");
        String numeroConta = sc.nextLine();

        System.out.println("Enter account holder: ");
        String titularConta = sc.nextLine();

        System.out.println("Is there in initial deposit?");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            cc = new ContaCorrente(numeroConta, titularConta, initialDeposit);
        } else{
            cc = new ContaCorrente(numeroConta, titularConta);
        }
System.out.println();
        System.out.println("Account Data: ");
        System.out.println(cc);
        
      System.out.println();
      System.out.print("Enter a deposit value: ");
      double depositValue = sc.nextDouble();
        cc.deposito(depositValue);
        System.out.println("Updated Account Data: ");
        System.out.println(cc);

        System.out.println();
      System.out.print("Enter a saque value: ");
      double saqueValue = sc.nextDouble();
        cc.saque(saqueValue);
        System.out.println("Updated Account Data: ");
        System.out.println(cc);
        
        sc.close();
    }
}
