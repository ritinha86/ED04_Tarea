package cuentas;

/**
 * Esta clase contiene información de cada cuenta
 * @author Rita
 */

public class CCuenta {

    /**
     * Método que devuelve el nombre del titular
     * @return nombre
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica el nombre del titular
     * @param nombre 
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta
     * @return cuenta
     */
    
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica el número de cuenta
     * @param cuenta 
     */
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo
     * @return saldo
     */
    
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo
     * @param saldo 
     */
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés
     * @return tipo de interés
     */
    
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Modifica el tipo de interés
     * @param tipoInterés 
     */
    
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros
     */
    
    public CCuenta() {
    }

    /**
     * Método constructor con parámetros
     * @param nom nombre del titular
     * @param cue numero de cuenta
     * @param sal saldo disponible
     * @param tipo tipo de interés
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }

    /**
     * Método que devuelve el saldo actual de la cuenta
     * @return
     */
    
    public double estado(){
        return getSaldo();
    }

    /**
     * Método para ingresar dinero en la cuenta
     * @param cantidad
     * @throws Exception
     */
    
    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad
     * @throws Exception
     */
    
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
