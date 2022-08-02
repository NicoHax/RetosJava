public class Cuenta {
    long NoCuenta;
    String FechaApertura;
    int TipoCuenta;
    double SaldoCuenta;
    public Cuenta (double NoCuenta, String FechaApertura, int TipoCuenta, double SaldoCuenta) {
        this.NoCuenta = (long) NoCuenta;
        this.FechaApertura = FechaApertura;
        this.TipoCuenta = TipoCuenta;
        this.SaldoCuenta = SaldoCuenta;
    }

    public double calcular_interes(){
        double Interes;
        switch (TipoCuenta) {
            case 1: Interes = 0.015 * this.SaldoCuenta;
                break;
            case 2: Interes = 0.017 * this.SaldoCuenta;
                break;
            case 3: Interes = 0.016 * this.SaldoCuenta;
                break;
            default: Interes = 7500 * this.SaldoCuenta;
                break;}
        return Float.parseFloat (String.valueOf(Interes));}}