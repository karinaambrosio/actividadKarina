package com.ka.EmpleadoServiceImpl;

import java.util.ArrayList;
import java.util.List;

import com.ka.empleado.Empleado;
import com.ka.interfaz.Empleadointerfaz;

public class EmpleadoServiceImpl implements Empleadointerfaz{
	private List <Empleado>empleados=new ArrayList <>();

	@Override
	public Empleadointerfaz registrarEmpleado(Empleado empleado) {
		empleados.add(empleado);
		return null;
	}

	@Override
	public List<Empleadointerfaz> listarEmpleados() {
		return empleados;
	}

	@Override
	public void bajarEmpleado(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularIgss(Empleadointerfaz empleado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularIrtra(Empleadointerfaz empleado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void agregarBono(Empleadointerfaz empleado, double bono) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarDescuento(Empleadointerfaz empleado, double descuento) {
		// TODO Auto-generated method stub
		
	
	
}

	@Override
	public Empleadointerfaz registrarEmpleado(Empleadointerfaz empleado) {
		// TODO Auto-generated method stub
		return null;
	}