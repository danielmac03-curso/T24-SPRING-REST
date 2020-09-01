package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	
	//Metodos del CRUD
	public List<Empleado> listarEmpleados();
	public Empleado guardarEmpleado(Empleado empleado);
	public Empleado empleadoXID(long id);
	public Empleado actualizarEmpleado(Empleado empleado);
	public void eliminarEmpleado(long id);
	public List<Empleado> listarEmpleadoTrabajo(String empleado);
}
