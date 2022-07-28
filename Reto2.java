import java.util.Scanner;

class Cuenta {
    private static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double Interes, SaldoCuenta, SaldoFinal, Total_Interes = 0, Total_Saldo = 0, InteresMensual;
        int CantidadUsuarios = Integer.parseInt(entrada.nextLine()), TipoCuenta;
        long NoCuenta;
        for (int i=0;i<CantidadUsuarios;i++){
            NoCuenta = entrada.nextLong();
            String FechaApertura = entrada.next();
            TipoCuenta = entrada.nextInt();
            float calcular_interes = 0; {
            switch (TipoCuenta) {
                case 1: Interes = 0.015;
                    break;
                case 2: Interes = 0.017;
                    break;
                case 3: Interes = 0.016;
                    break;
                default: Interes = 7500; // se puso este default para solucionar error en la entrada en moodle
                    break;}
            SaldoCuenta = entrada.nextDouble();
            InteresMensual = SaldoCuenta * Interes; }
            SaldoFinal = SaldoCuenta + InteresMensual;
            Total_Interes = Total_Interes + InteresMensual;
            Total_Saldo = Total_Saldo + SaldoFinal;
            System.out.println(NoCuenta);
            System.out.println(calcular_interes);
            System.out.println(SaldoFinal);}
        System.out.println(Total_Interes);
        System.out.println(Total_Saldo);
        }}


