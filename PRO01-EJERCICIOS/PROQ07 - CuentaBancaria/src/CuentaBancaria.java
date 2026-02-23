class CuentaBancaria{

    //Atributos

    private String sIban;
    private String sTitular;
    private double dSaldo;
    private boolean bActiva;

    //Constructores

    public CuentaBancaria(){
        this.sIban=generarIban();
        this.sTitular=null;
        this.dSaldo=0;
        this.bActiva=true;
    }

    public CuentaBancaria(String iban, String titular){
        this.sIban=iban;
        this.sTitular=titular;
        this.dSaldo=0;
        this.bActiva=true;
    }

    //Getter and setter

    public String getsIban(){
        return this.sIban;
    }

    public String getsTitular(){
        return this.sTitular;
    }

    public double getdSaldo(){
        return this.dSaldo;
    }

    public boolean getbActiva(){
        return this.bActiva;
    }

    public void setsTitular(String titular){
        this.sTitular=titular;
    }

    //Métodos

    public void ingresar(double cantidad){
        if (this.bActiva&&cantidad>=0){
            dSaldo+=cantidad;
        }else{
            System.out.println("Error. Intentalo de nuevo.");
        }
    }

    public void retirar(double cantidad){
        if (this.bActiva&&cantidad>=0&&cantidad<=dSaldo){
            this.dSaldo-=cantidad;
        }else{
            System.out.println("Error. Intentalo de nuevo.");
        }
    }

    public void desactivarCuenta(){
        this.bActiva=false;
    }

    public void mostrarDatos(){
        System.out.println("IBAN: " + sIban);
        System.out.println("Titular: " + sTitular);
        System.out.println("Saldo: " + dSaldo);
        if (bActiva){
            System.out.println("Estado: Activa");
        }else{
            System.out.println("Estado: Inactiva");
        }
    }

    private String generarIban(){
        String iban="ES";
        for (int i=0;i<2;i++){
            int digito=(int)(Math.random()*10);
            iban+=digito;
        }

        for (int i=0;i<16;i++){
            int digito=(int)(Math.random()*10);
            iban+=digito;
        }
        return iban;
    }
}