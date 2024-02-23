package cuentas;
/**
 * Clase CCuenta variables:
 * private String nombre;
 * private String cuenta;
 * private double saldo;
 * private double tipoInterés;
 * @author lolab
 * 
 */
public class CCuenta {
   
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Constructor de la clase CCuenta sin parámetros 
     */
    public CCuenta()
    {
    }
    /**
     * Constructor de la clase CCuenta con parámatros.
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Método estado retorna el estado
     * @return getSaldo()
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Método ingresar No se puede ingresar una cantidad negativa y nos suma al saldo la cantidad 
     * que ingresemos. 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método retirar con dos excepciones, no se puede retirar una cantidad negativa
     * ni tampoco si no hay saldo suficiente,también nos resta del saldo la cantidad que retiremos. 
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * Método getNombre retorna el nombre.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método setNombre modifica el nombre.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método getCuenta retorna cuenta.
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Método setCuenta modifica cuenta.
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Método getSaldo retorna el saldo.
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Método setSaldo modifica el saldo.
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Método getTipoInterés retorna el tipo de interés.
     * @return 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * Método setTipoInterés modifica el tipo de interés.
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }  
}
