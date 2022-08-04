import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    long NoCuenta;
    String FechaApertura;
    double SaldoCuenta, ValorPer;
    float Interes;
    NoCuenta = entrada.nextLong();
    FechaApertura = entrada.next();
    SaldoCuenta = entrada.nextDouble();
    ValorPer = entrada.nextDouble();
    Interes = entrada.nextFloat();
    CuentaCorriente objetoCuentaCorriente = new CuentaCorriente(NoCuenta,FechaApertura, SaldoCuenta, ValorPer, Interes);
    Interes = (float) objetoCuentaCorriente.calcular_interes();
    System.out.println(Interes);}}
