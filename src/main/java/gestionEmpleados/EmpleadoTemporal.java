package gestionEmpleados;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @date 16-02-2024
 *
 */
/**
 * Clase que representa a un empleado temporal.
 */
public class EmpleadoTemporal extends Empleado {

    private final GregorianCalendar fechaAlta;
    private final GregorianCalendar fechaBaja;

    /**
     * Constructor de la clase EmpleadoTemporal.
     *
     * @param fechaAlta Fecha de alta del empleado.
     * @param fechaBaja Fecha de baja del empleado.
     * @param NIF Número de identificación fiscal.
     * @param nombre Nombre del empleado.
     * @param edad Edad del empleado.
     */
    public EmpleadoTemporal(GregorianCalendar fechaAlta, GregorianCalendar fechaBaja, String NIF, String nombre, int edad) {
        super(NIF, nombre, edad);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    // Seria para sueldo total desde que lo contratan hasta que lo despiden
    /*@Override
    public double calculaSueldo() {
        int añosDiferencia = fechaBaja.get(Calendar.YEAR) - fechaAlta.get(Calendar.YEAR);
        int mesesDiferencia = fechaBaja.get(Calendar.MONTH) - fechaAlta.get(Calendar.MONTH);

        int diferenciaTotalEnMeses = añosDiferencia * 12 + mesesDiferencia;

        return Empleado.salarioMinimo * diferenciaTotalEnMeses;
    }/*
    
    
    /**
     * Calcula el sueldo mensual del empleado temporal.
     * 
     * @return  Sueldo mensual del empleado temporal.
     */
    @Override
    public double calculaSueldo() {
        return Empleado.salarioMinimo;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaAltaFormateada = formatoFecha.format(fechaAlta.getTime());
        String fechaBajaFormateada = formatoFecha.format(fechaBaja.getTime());

        return "Empleado Temporal -> " + super.toString() + ", Fecha de Alta: " + fechaAltaFormateada + ", Fecha de Baja: " + fechaBajaFormateada;
    }

}
