package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "trabajo")
	private String trabajo;
	
	@Column(name = "salario")
	private Double salario;

	//Constructores
	public Empleado() {}
	
	/*
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	public Empleado(Long id, String nombre, String trabajo, Double salario) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = ponerSalario(trabajo, salario);
	}

	//Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
		this.salario = ponerSalario(trabajo, salario);
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	//toString
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}

	public Double ponerSalario(String trabajo, Double salario) {
		switch (trabajo) {
			case "Programador":
				salario = 2000.0;
				break;
			case "Ventas":
				salario = 2200.0;
				break;
			case "Administracion":
				salario = 1700.0;
				break;		
		}	
			
		return salario;
	}
		
}
