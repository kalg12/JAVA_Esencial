public class CuentaBancaria {
    String titular;
    TipoDeCuenta tipoDeCuenta;
    double saldo;

    //En Java, la palabra reservada final se usa para evitar que algo cambie.
    //Su significado exacto depende de dónde la apliques:
    /* public static final String TIPO_AHORRO = "Ahorro";
    public static final String TIPO_NOMINA = "Nomina";*/

    final double COMISION = 1.2;


    //Creamos nuestros constructores
    CuentaBancaria(String t, TipoDeCuenta tipo, double saldo) {
        this.titular = t;
        this.tipoDeCuenta = TipoDeCuenta.AHORRO;
        this.saldo = saldo;
    }

    //Podemos crear otro constructor
    CuentaBancaria(String t, double saldo) {
        this.titular = t;
        tipoDeCuenta = TipoDeCuenta.AHORRO;
        this.saldo = saldo;
    }

    CuentaBancaria() {
        tipoDeCuenta = TipoDeCuenta.NOMINA;
    }

    void sacarDinero(double cantidad){
        if(cantidad < 0){
            return; //no procesamos nada
        }
        double comision = 0;
        if(tipoDeCuenta.equals(TipoDeCuenta.AHORRO)){
            comision = COMISION;
        }
        System.out.println(saldo);
        saldo -= cantidad;
        saldo -= comision;
        System.out.println("Saldo actual: " + saldo);
        System.out.println(comision);
    }

    void ingresarDinero(double cantidad){
        if(cantidad < 0){
            return;
        }
        saldo += cantidad;
    }

    void cambiarTipoDeCuenta(String nuevoTipo){
        this.tipoDeCuenta = TipoDeCuenta.valueOf(nuevoTipo);
    }

    double obtenerSaldo(){
        return saldo;
    }
}