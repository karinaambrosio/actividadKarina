
package com.ka.interfaz;


import java.util.List;

import com.ka.empleado.Empleado;
public interface Empleadointerfaz {
    Empleadointerfaz registrarEmpleado(Empleadointerfaz empleado);
    List<Empleadointerfaz> listarEmpleados();
    void bajarEmpleado(Long id);
    double calcularIgss(Empleadointerfaz empleado);
    double calcularIrtra(Empleadointerfaz empleado);
    void agregarBono(Empleadointerfaz empleado, double bono);
    void agregarDescuento(Empleadointerfaz empleado, double descuento);
	Empleadointerfaz registrarEmpleado(Empleado empleado);
}

