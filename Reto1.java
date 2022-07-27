import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double Interes = 0, SaldoCuenta, SaldoFinal, Total_Interes = 0, Total_Saldo = 0, InteresMensual;
        int CantidadUsuarios = Integer.parseInt(entrada.nextLine()), TipoCuenta;
        long NoCuenta;
        String FechaApertura = null;
        for (int i=0;i<CantidadUsuarios;i++){
            NoCuenta = entrada.nextLong();
            FechaApertura = entrada.next();
            TipoCuenta = entrada.nextInt();
            switch (TipoCuenta) {
                case 1: Interes = 0.015;
                break;
                case 2: Interes = 0.017;
                break;
                case 3: Interes = 0.016;
                break;
                default: Interes = 7500;
                break;}
            SaldoCuenta = entrada.nextDouble();
            InteresMensual = SaldoCuenta * Interes;
            SaldoFinal = SaldoCuenta + InteresMensual;
            Total_Interes = Total_Interes + InteresMensual;
            Total_Saldo = Total_Saldo + SaldoFinal;
            float FloatInteresMensual = Float.parseFloat(String.valueOf((InteresMensual)));
            System.out.println(NoCuenta);
            System.out.println(FloatInteresMensual);
            System.out.println(SaldoFinal);}
            System.out.println(Total_Interes);
            System.out.println(Total_Saldo);
       }}