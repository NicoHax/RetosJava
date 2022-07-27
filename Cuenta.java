import java.util.Scanner;

class Cuenta {
    private static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double Interes = 0, SaldoCuenta, SaldoFinal, Total_Interes = 0, Total_Saldo = 0, InteresMensual;
        int CantidadUsuarios, TipoCuenta;
        long NoCuenta;
        String FechaApertura = null;
        CantidadUsuarios = entrada.nextInt();
        for (int i=0;i<CantidadUsuarios;i++){
            NoCuenta = entrada.nextLong();
            FechaApertura = entrada.next();
            TipoCuenta = entrada.nextInt();
            switch (TipoCuenta) {
                case 1 -> Interes = 0.015;
                case 2 -> Interes = 0.017;
                case 3 -> Interes = 0.016;}
            SaldoCuenta = entrada.nextDouble();
            InteresMensual = SaldoCuenta * Interes;
            SaldoFinal = SaldoCuenta + InteresMensual;
            Total_Interes = Total_Interes + InteresMensual;
            Total_Saldo = Total_Saldo + SaldoFinal;
            float FloatInteresMensual = Float.parseFloat(String.valueOf(InteresMensual));
            System.out.println(NoCuenta);
            System.out.println(FloatInteresMensual);
            System.out.println(SaldoFinal);}
        System.out.println(Total_Interes);
        System.out.println(Total_Saldo);
    }}

