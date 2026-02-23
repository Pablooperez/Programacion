package POO_Basico;

public class CuentaBancaria {

    //Atributos

    private String sTitular="";
    private double dSaldo=0;

    //Constructores

    public CuentaBancaria(String titular){
        this.sTitular=titular;
        this.dSaldo=0;
    }

    public CuentaBancaria(String titular, double saldo){
        this.sTitular=titular;
        this.dSaldo=saldo;
    }

    //Getter and setters

    public String getTitular(){
        return this.sTitular;
    }

    public double getSaldo() {

        if (dSaldo >= 0) {
            return this.dSaldo;
        }
        return this.dSaldo;
    }

    public void setTitular(String titular){
        this.sTitular=titular;
    }

    //Métodos

    public void depositar(double cantidad){
        this.dSaldo+=cantidad;
    }

    public void retirar(double cantidad){
        if (cantidad>dSaldo){
            System.out.println("Error. No hay tanto dinero en la cuenta");
        }else{
            this.dSaldo-=cantidad;
        }
    }

    public void mostrarSaldo(){
        System.out.println("Titular: " + sTitular);
        System.out.println("Saldo: " + dSaldo);
    }

}
