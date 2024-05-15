package cuentas;

/**
 * Clase que ahce referencia a una cuenta bancaria de un banco
 * 
 * @author Juan
 * @version 1.0
 * @since 1.0
 */
public class CCuenta {

    //atributos de clase
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacio para crear un objeto CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor que inicializa los parametros de clase de las cuentas.
     * @param nom Nombre de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el nombre de la cuenta.
     * @return El nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la cuenta.
     * @param nombre Nuevo nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de la cuenta.
     * @return El número de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece un nuevo número para la cuenta.
     * @param cuenta Nuevo número de cuenta a establecer.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return El saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo a la cuenta.
     * @param saldo El nuevo saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interes
     * @return El tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el nuevo tipo de interes.
     * @param tipoInterés El nuevo tipo de interes a establecer.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el saldo de la cuenta.
     * @return El saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad al saldo de la cuenta.
     * @param cantidad Cantidad nueva a añadir.
     * @throws Exception Cuando obtiene una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Cuando la cantidad es negativa o cuando no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
