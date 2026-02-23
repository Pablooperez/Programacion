public class CuentaBancariaMain {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria=new CuentaBancaria();

        cuentaBancaria.ingresar(100);

        cuentaBancaria.setsTitular("Pablo Pérez Martínez");
        cuentaBancaria.mostrarDatos();
        cuentaBancaria.retirar(100);
        cuentaBancaria.mostrarDatos();
        cuentaBancaria.desactivarCuenta();
        cuentaBancaria.mostrarDatos();
    }
}
