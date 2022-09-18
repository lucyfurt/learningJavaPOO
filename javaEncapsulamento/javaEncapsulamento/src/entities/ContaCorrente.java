package entities;

public class ContaCorrente{

    private String numeroConta;
    private String titularConta;
    private double saldo;
    
    
    public ContaCorrente(){

    }
    public ContaCorrente(String numeroConta, String titularConta, double initialDeposit) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        deposito(initialDeposit);
    }

    public ContaCorrente(String numeroConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
    
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

  
    public Double getSaldo() {
        return saldo;
    }

public void deposito(double amount){
    saldo += amount;
 }   


 public void saque(double amount){
    saldo-= amount + 5.0;
 }
@Override
public String toString() {
    return "ContaCorrente [numeroConta=" + numeroConta + ", saldo=" + saldo + ", titularConta=" + titularConta + "]";
}

}