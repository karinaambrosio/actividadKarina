package com.ka.empleado;

import java.time.LocalDate;
public class Empleado {
    private Long IDempleado; 
    private String nombre;
    private String puesto;
    private double salarioBase;
    private LocalDate fechaIngreso; 
    private String departamento;
    private double igss;
    private double deducciones;
    private double irtra;
    
    //CONTROLADOR
    public Long getIDempleado() { return IDempleado; }
    public void setIDempleado(Long IDepleado) { this.IDempleado = IDempleado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }

    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public double getIgss() { return igss; }
    public void setIgss(double igss) { this.igss = igss; }

    public double getDeducciones() { return deducciones; }
    public void setDeducciones(double deducciones) { this.deducciones = deducciones; }

    public double getIrtra() { return irtra; }
    public void setIrtra(double irtra) { this.irtra = irtra; }
	public Empleado(Long iDempleado, String nombre, String puesto, double salarioBase, LocalDate fechaIngreso,
			String departamento, double igss, double deducciones, double irtra) {
		
		super();
		IDempleado = iDempleado;
		this.nombre = nombre;
		this.puesto = puesto;
		this.salarioBase = salarioBase;
		this.fechaIngreso = fechaIngreso;
		this.departamento = departamento;
		this.igss = igss;
		this.deducciones = deducciones;
		this.irtra = irtra;
	
	}
}
