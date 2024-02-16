package gestionEmpleados;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EmpleadoTemporal extends Empleado {

    private GregorianCalendar fechaAlta;
    private GregorianCalendar fechaBaja;

    public EmpleadoTemporal(GregorianCalendar fechaAlta, GregorianCalendar fechaBaja, String NIF, String nombre, int edad) {
        super(NIF, nombre, edad);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public String getNombre() {
        return nombre;
    }
    
    //Seria para sueldo total desde que lo contratan hasta que lo despiden
    /*@Override
    public double calculaSueldo() {
        int añosDiferencia = fechaBaja.get(Calendar.YEAR) - fechaAlta.get(Calendar.YEAR);
        int mesesDiferencia = fechaBaja.get(Calendar.MONTH) - fechaAlta.get(Calendar.MONTH);

        int diferenciaTotalEnMeses = añosDiferencia * 12 + mesesDiferencia;

        return Empleado.salarioMinimo * diferenciaTotalEnMeses;
    }*/
    
    @Override
    public double calculaSueldo(){
          return Empleado.salarioMinimo;
    }
    
    @Override
    public String toString() {
        return "Empleado Temporal -> " + super.toString() + ", Fecha de Alta: " + fechaAlta.getTime() + ", Fecha de Baja: " + fechaBaja.getTime();
    }   

}
