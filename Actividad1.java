//Actividad de ejercicio de clase
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        System.out.println("Valor a pagar:");
        System.out.println("Valor de la compra: ");
        double valorDcto = 0;
        double valorPagar;
        Scanner entrada = new Scanner(System.in);
        double valorCompra = entrada.nextDouble();
        if (valorCompra >= 500000) {
            valorDcto = valorCompra * 0.05;
        } else if (valorCompra > 1000001){
            valorDcto = valorCompra * 0.11;
        } else if (valorCompra > 7000001){
            valorDcto = valorCompra * 0.18;
        } else if (valorCompra > 15000000) {
            valorDcto = valorCompra * 0.25;
        }
        valorPagar = (valorCompra - valorDcto);

        System.out.printf("Valor a pagar: %.2f", valorPagar);
        System.out.printf("%nValor descuento: %.2f", valorDcto);
    }}
