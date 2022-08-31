package Salary;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner cantidad = new Scanner(System.in);
		int salarioPorHora = 26;
		int horasTrabajadas, suma , diasTrabajados;
		String nombre;
		
		System.out.println("Hola!, ¿Cual es el nombre del empleado?: ");
		nombre = cantidad.nextLine();
		
		
		System.out.println("¿Cuantas horas trabajo el empleado?: ");
	
		
		horasTrabajadas = cantidad.nextInt();
		
		System.out.println("¿Cuantos dias trabajo el empleado?: ");	
		diasTrabajados = cantidad.nextInt();
		
		
		
		suma = salarioPorHora * horasTrabajadas * diasTrabajados;
		System.out.println("El salario total de "+ nombre + " es de: " +suma);
	
		
		
		

	}

}
