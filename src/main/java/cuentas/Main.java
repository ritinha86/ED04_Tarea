package cuentas;

/**
 * Clase principal
 * @author Rita
 */
public class Main {

    /**
     * Método main
     * @param args
     */
    public static void main(String[] args) {
        operativa_cuenta();
    }
        
    /**
     * Método para operar con la cuenta
     */
    public static void operativa_cuenta() {
        
        float cantidad;
        CCuenta cuenta1;
        double saldoActual;
       
        // Creamos una cuenta con un nombre y un saldo
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        // Retiramos dinero
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        // Ingresamos dinero
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
