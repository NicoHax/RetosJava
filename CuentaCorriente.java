public class CuentaCorriente extends Cliente{
    long NoCuenta;
    String FechaApertura;
    double SaldoCuenta, ValorPer;
    float Interes;
    public CuentaCorriente (long NoCuenta, String FechaApertura, double SaldoCuenta, double ValorPer, float Interes) {
        this.NoCuenta = NoCuenta;
        this.FechaApertura = FechaApertura;
        this.SaldoCuenta = SaldoCuenta;
        this.ValorPer = ValorPer;
        this.Interes = Interes;
    }
    public double calcular_interes(){
    return Interes = (float) (Interes * SaldoCuenta);
    }
}
