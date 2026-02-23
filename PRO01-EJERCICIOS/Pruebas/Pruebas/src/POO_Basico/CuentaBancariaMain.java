package POO_Basico;

public class CuentaBancariaMain {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1=new CuentaBancaria("Ana",1000);
        cuentaBancaria1.mostrarSaldo();
        cuentaBancaria1.depositar(500);
        cuentaBancaria1.mostrarSaldo();
        cuentaBancaria1.retirar(200);
        cuentaBancaria1.mostrarSaldo();
        cuentaBancaria1.retirar(2000);
    }
}
