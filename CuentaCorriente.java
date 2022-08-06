class Cliente {
    long Documento_Identidad;
    String Nombre, Email, dirección;
    int Celular; }
class Cuenta extends Cliente{ //Debe heredar los atributos de la clase Cliente, por eso se usa extends.
    long NoCuenta;
    String FechaApertura;
    int TipoCuenta;
    double SaldoCuenta;
    Cuenta (long NoCuenta, String FechaApertura, int TipoCuenta, double SaldoCuenta, long Documento_Identidad, String Nombre, String Email, int Celular, String dirección) {
        this.NoCuenta = NoCuenta;
        this.FechaApertura = FechaApertura;
        this.TipoCuenta = TipoCuenta;
        this.SaldoCuenta = SaldoCuenta;
        this.Documento_Identidad = Documento_Identidad;
        this.Nombre = Nombre;
        this.Email = Email;
        this.Celular = Celular;
        this.dirección = dirección;}
    Cuenta(long NoCuenta, String FechaApertura, int TipoCuenta, double SaldoCuenta) {
        this.NoCuenta = NoCuenta;
        this.FechaApertura = FechaApertura;
        this.TipoCuenta = TipoCuenta;
        this.SaldoCuenta = SaldoCuenta;}
    double calcular_interes(){
        double Interes;
        switch (TipoCuenta){
            case 1: Interes = 0.015;
                break;
            case 2: Interes = 0.017;
                break;
            case 3: Interes = 0.016;
                break;
            default: Interes = 7500;
                break;}
        return Interes*SaldoCuenta;}}
public class CuentaCorriente extends Cliente{
    long NoCuenta;
    String FechaApertura;
    double SaldoCuenta, ValorPer, porcentaje_interes;
    float interes;
    public CuentaCorriente (long NoCuenta, String FechaApertura, double SaldoCuenta, double porcentaje_interes, double ValorPer, long Documento_Identidad, String Nombre, String Email, int Celular, String Dirección) {
        this.NoCuenta = NoCuenta;
        this.FechaApertura = FechaApertura;
        this.SaldoCuenta = SaldoCuenta;
        this.porcentaje_interes = porcentaje_interes;
        this.ValorPer = ValorPer;
        this.Documento_Identidad = Documento_Identidad;
        this.Nombre = Nombre;
        this.Email = Email;
        this.Celular = Celular;
        this.dirección = dirección;}
    public CuentaCorriente(long NoCuenta, String FechaApertura, int SaldoCuenta, double porcentaje_interes) {
        this.NoCuenta = NoCuenta;
        this.FechaApertura = FechaApertura;
        this.SaldoCuenta = SaldoCuenta;
        this.porcentaje_interes = porcentaje_interes;}
    public CuentaCorriente(long NoCuenta, String FechaApertura, int SaldoCuenta, double porcentaje_interes,double ValorPer) {
        this.NoCuenta = NoCuenta;
        this.FechaApertura = FechaApertura;
        this.SaldoCuenta = SaldoCuenta;
        this.porcentaje_interes = porcentaje_interes;
        this.ValorPer = ValorPer;}
    double calcular_interes(){
        double interes = 0;
        return interes = this.SaldoCuenta*(this.porcentaje_interes/100);
    }}