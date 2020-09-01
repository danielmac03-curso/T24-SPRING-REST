package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Empleado;
import com.example.demo.dao.IEmpleadoDAO;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(long id) {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.findById(id).get();
	}
	
	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}
	
	@Override
	public void eliminarEmpleado(long id) {
		iEmpleadoDAO.deleteById(id);
	}
	
	@Override
	public List<Empleado> listarEmpleadoTrabajo(String trabajo) {
		return iEmpleadoDAO.findByTrabajo(trabajo);
	}

}
