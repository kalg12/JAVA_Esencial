public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        /*CuentaBancaria cuentaDeKevin = new CuentaBancaria("Kevin Luciano", 20000);
        System.out.println("Saldo del usuario: " + cuentaDeKevin.titular + " " + cuentaDeKevin.saldo);
        System.out.println("Tipo de cuenta: " + cuentaDeKevin.tipoDeCuenta);*/

        //Ejercicio 2
        CuentaBancaria cuentadeKevin = new CuentaBancaria("Kevin Luciano", TipoDeCuenta.AHORRO,1600.0);
        cuentadeKevin.sacarDinero(300);
    }
}