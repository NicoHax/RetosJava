public class Reto3 {
    public static void main(String[] args) {
    float InteresCuenta;
    Cuenta objeto_cuenta=new Cuenta(10,"2010/10/06/",1,600000);
    Cuenta objeto_cuenta2 = new Cuenta(10,"2010/10/06/",1,600000,91243,"Luisa Lane","llane@gmail.com",312312456,"Calle 20 no 30-40");
    CuentaCorriente objeto_corriente=new CuentaCorriente(10,"2010/10/06/",600000,2.5);
    CuentaCorriente objeto_corriente2=new CuentaCorriente(10,"2010/10/06/",600000,2.5,100000);
    CuentaCorriente objeto_corriente3=new CuentaCorriente(10,"2010/10/06/",600000,2.5,100000,91243,"Luisa Lane","llane@gmail.com",312312456,"Calle 20 no 30-40");
    InteresCuenta = (float) objeto_cuenta.calcular_interes();
    System.out.println(objeto_corriente.calcular_interes());
    System.out.println(InteresCuenta);}}
