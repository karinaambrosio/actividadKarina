package com.ka.Main; 

import com.ka.EmpleadoServiceImpl.*;
import com.ka.interfaz.Empleadointerfaz;
import com.ka.empleado.Empleado;


public class Main {

    public static void main(String[] args) {
        Empleadointerfaz empleadoService = new EmpleadoServiceImpl();  // Usa la interfaz como tipo.

        empleadoService.registrarEmpleado(new Empleado("José Morales", 4500, "10-02-2018", "Ventas"));
        empleadoService.registrarEmpleado(new Empleado("Ana Castillo", 6200, "25-07-2020", "Recursos Humanos"));
        empleadoService.registrarEmpleado(new Empleado("Luis Mijangos", 5300, "14-11-2019", "Contabilidad"));

        System.out.println("Lista de empleados:");
        empleadoService.listarEmpleados().forEach(System.out::println);

        empleadoService.agregarBono(1, 400);
        empleadoService.agregarDescuento(2, 150);

        double igssJose = empleadoService.calcularIgss(1);
        double irtraJose = empleadoService.calcularIrtra(1);
        System.out.println("IGSS de José Morales: " + igssJose);
        System.out.println("IRTRA de José Morales: " + irtraJose);

        empleadoService.bajarEmpleado(3);

        System.out.println("Lista de empleados después de eliminar:");
        empleadoService.listarEmpleados().forEach(System.out::println);
    }
}