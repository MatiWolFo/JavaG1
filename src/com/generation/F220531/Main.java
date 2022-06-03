package com.generation.F220531;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.generation.f20220531.manager.ClienteManager;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// arreglo de clientes
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		int opcion = 0;

		// instancia de cliente
		Cliente cliente = new Cliente();
		cliente.setId(1234);
		cliente.setNombre("Donato");
		cliente.setRut("123456789-0");

		do {
			// excepciones
			Cliente clienteDatosDinamicos = new Cliente();

			System.out.println("Ingrese el id de Cliente");
			/// Integer id2 = sc.nextInt();
			String idString = sc.nextLine();

			try {
				Integer id = Integer.parseInt(idString);// null para probar el error
				clienteDatosDinamicos.setId(id);// id +1 para probar error
				sc.nextLine();

				System.out.println("Ingrese el nombre de Cliente");
				String nombre = sc.nextLine();
				clienteDatosDinamicos.setNombre(nombre);

				// rut
				System.out.println("Ingrese el rut de Cliente");
				String rut = sc.nextLine();
				clienteDatosDinamicos.setRut(rut);
				// correo
				System.out.println("Ingrese el correo de Cliente");
				String correo = sc.nextLine();
				clienteDatosDinamicos.setCorreo(correo);

				// Integer division = 100/0;
				// System.out.println(division);

			} catch (ArithmeticException ae) {
				System.out.println("Error al dividir por cero");

			} catch (NullPointerException npe) {
				System.out.println("No se puede realizar la operacion matematica, un dato es nulo");
			} catch (InputMismatchException ime) {
				System.out.println("Error en el ingreso de un dato");
			} catch (NumberFormatException nfe) {
				System.out.println("No puede ingresar un letra como identificador " + nfe);
			} catch (Exception e) {
				System.out.println("Ha ocurrido un error, contecte al administrador " + e);
			}

			// agregar el cliente a la lista
			listaCliente.add(clienteDatosDinamicos);
			
			//solicitando el repetir el ingreso de datos
			do {
				System.out.println("Desea ingresar un nuevo cliente? (1) si (0) no");
				opcion = sc.nextInt();
			} while (opcion < 0 || opcion > 1);

			sc.nextLine();

		} while (opcion == 1);
		
		
		/**acceder al metodo de otra clase**/
		//instancia de la clase
		ClienteManager cm = new ClienteManager();
		cm.recorrerArregloCliente(listaCliente);
		

	}

}
