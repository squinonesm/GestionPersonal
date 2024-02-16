package ies_comercio.gestionpersonal;

import gestionEmpleados.EmpleadoFijo;
import gestionEmpleados.EmpleadoPorHoras;
import gestionEmpleados.EmpleadoTemporal;
import java.util.GregorianCalendar;

/**
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @date 15-02-2024
 *
 */
public class Run {

    public static void main(String[] args) {

        // Crear un empleado de cada tipo
        // Crear un empleado fijo
        GregorianCalendar fechaAltaFijo = new GregorianCalendar(2020, 0, 1); // 1 de enero de 2020
        EmpleadoFijo empleadoFijo = new EmpleadoFijo(fechaAltaFijo, 50, "12345678A", "Juan", 30);
        System.out.println("Sueldo de " + empleadoFijo.toString() + ", cuyo sueldo mensual es: " + empleadoFijo.calculaSueldo()); // Antes de cambiar el complemento
        empleadoFijo.setComplementoAnual(100); //Podemos cambiar su complemento anual
        System.out.println("Sueldo de " + empleadoFijo.toString() + ", cuyo sueldo mensual es: " + empleadoFijo.calculaSueldo()); // Después de cambiar el complemento

        // Crear un empleado temporal
        GregorianCalendar fechaAltaTemporal = new GregorianCalendar(2022, 6, 1); // 1 de julio de 2022
        GregorianCalendar fechaBajaTemporal = new GregorianCalendar(2023, 5, 30); // 30 de junio de 2023
        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(fechaAltaTemporal, fechaBajaTemporal, "98765432B", "María", 25);
        System.out.println("Sueldo de " + empleadoTemporal.toString() + ", cuyo sueldo mensual es: " + empleadoTemporal.calculaSueldo());

        // Crear un empleado por horas
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(10, 40, "56789012C", "Pedro", 35);
        System.out.println("Sueldo de " + empleadoPorHoras.toString() + ", cuyo sueldo mensual es: " + empleadoPorHoras.calculaSueldo()); // Antes de cambiar las horas trabajadas
        empleadoPorHoras.setHorasTrabajadas(20); //Podemos cambiar las horas trabajadas
        System.out.println("Sueldo de " + empleadoPorHoras.toString() + ", cuyo sueldo mensual es: " + empleadoPorHoras.calculaSueldo()); // Después de cambiar las horas trabajadas
        
        
    }
}
