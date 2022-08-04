import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long NoCuenta;
        String FechaApertura;
        int TipoCuenta;
        double Interes, SaldoCuenta;
        NoCuenta = entrada.nextLong();
        FechaApertura = entrada.next();
        TipoCuenta = entrada.nextInt();
        SaldoCuenta = entrada.nextDouble();
        Cuenta objetoCuenta = new Cuenta(NoCuenta,FechaApertura, TipoCuenta, SaldoCuenta);
        Interes = objetoCuenta.calcular_interes();
        System.out.println(Interes);}}