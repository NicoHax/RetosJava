import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long NoCuenta;
        String FechaApertura;
        int TipoCuenta;
        double interesCuenta, SaldoCuenta, interes_cuenta;
        NoCuenta = entrada.nextLong();
        FechaApertura = entrada.next();
        TipoCuenta = entrada.nextInt();
        SaldoCuenta = entrada.nextDouble();
        //Cuenta objeto_cuenta=new Cuenta(10,"2010/10/06/",1,600000);
        Cuenta objetoCuenta = new Cuenta(NoCuenta,FechaApertura, TipoCuenta, SaldoCuenta);
        //interes_cuenta = objeto_cuenta.calcular_interes();
        interesCuenta = objetoCuenta.calcular_interes();
        //System.out.println(interes_cuenta);
        System.out.println(interesCuenta);}}