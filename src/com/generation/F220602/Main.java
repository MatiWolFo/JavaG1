package com.generation.F220602;
//IMPORTAR LAS LIBRERIAS DE LAS LISTAS
import java.util.ArrayList;
import java.util.List;
//IMPORTAR LOS HEREDABLES
import com.generation.F220602.models.Alumno;
import com.generation.F220602.models.Profesor;
import com.generation.F220602.models.Usuario;

public class Main {
	public static void main(String[] args) {
		//CREAR LAS LISTAS DE LOS HEREDABLES
		List<Usuario> listaUsuarios = new ArrayList<>();
		List<Profesor> listaProfesores = new ArrayList<>();
		List<Alumno> listaAlumnos = new ArrayList<>();			
		//CREAR LAS INSTANCIAS DE LOS DISTINTOS USUARIOS
        Usuario diana321 = new Usuario();//instancia
        //SETEAR SUS ATRIBUTOS (FORMA MANUAL)
        diana321.setUsername("Diana321");//set
        diana321.setPassword("hola1234");//set
        diana321.setGenUsuario("Femenino");//set
        diana321.setEmailRegistro("dianamp@gmail.com");//set
        //AGREGAR A LA O LAS LISTAS DE INTERES
        listaUsuarios.add(diana321);//add a usuario "diana321" a listaUsuarios
        Usuario michael321 = new Usuario();//instancia
        michael321.setUsername("Michael321");//set
        michael321.setPassword("hola4321");//set
        michael321.setGenUsuario("Masculino");//set
        michael321.setEmailRegistro("michaelr@gmail.com");//set
        listaUsuarios.add(michael321);//add a usuario "michael321" a listaUsuarios
        Usuario alondra321 = new Usuario();//instancia
        alondra321.setUsername("Alondra321");//set
        alondra321.setPassword("hola43215");//set
        alondra321.setGenUsuario("Femenino");//set
        alondra321.setEmailRegistro("alondra@gmail.com");//set
        listaUsuarios.add(alondra321);//add a usuario "alondra321" a listaUsuarios
        Usuario matias321 = new Usuario();//instancia
        matias321.setUsername("Matias321");//set
        matias321.setPassword("hola43216");//set
        matias321.setGenUsuario("Masculino");//set
        matias321.setEmailRegistro("matias@gmail.com");//set
        listaUsuarios.add(matias321);//add a usuario "matias321" a listaUsuarios
        Usuario paulino321 = new Usuario();//instancia
        paulino321.setUsername("Paulino321");//set
        paulino321.setPassword("hola43217");//set
        paulino321.setGenUsuario("Masculino");//set
        paulino321.setEmailRegistro("paulino@gmail.com");//set
        listaUsuarios.add(paulino321);//add a usuario "paulino321" a listaUsuarios		
        Profesor profesor1 = new Profesor();
		profesor1.setUsername("Profe123");
		profesor1.setPassword("Admin123");
		profesor1.setEdadUsuario(30);
		profesor1.setEmailRegistro("prueba@java1.cl");
		profesor1.setIdProfesor("ProfePrueba");
		profesor1.setJefaturaProfesor("4to A");
		//SE PUEDE AGREGAR A UNA O MAS LISTAS
		listaUsuarios.add(profesor1);
		listaProfesores.add(profesor1);
		//CREANDO ESTUDIANTE CON BOOLEAN TRUE
		Alumno alumno1 = new Alumno();		
		alumno1.setUsername("Alumno123");
		alumno1.setPassword("Student123");
		alumno1.setEdadUsuario(10);
		alumno1.setCurso("4to A");
		alumno1.setAsignatura("Intro Programacion");
		alumno1.setAsistencia(true);
		listaUsuarios.add(alumno1);
		listaAlumnos.add(alumno1);
		//CREANDO ESTUDIANTE CON BOOLEAN FALSE
		Alumno alumno2 = new Alumno();		
		alumno2.setUsername("Alumno245");
		alumno2.setPassword("Student245");
		alumno2.setEdadUsuario(9);
		alumno2.setCurso("4to A");
		alumno2.setAsignatura("Intro Programacion");
		alumno2.setAsistencia(false);
		listaUsuarios.add(alumno2);
		listaAlumnos.add(alumno2);
		//IMPRIMIR LAS DISTINTAS LISTAS
		//ENCABEZADO SEPARADOR
        System.out.println("************************************Generation************************************");
        System.out.println("Lista de usuarios: \n");
        //FOR PARA ITERAR LAS LISTAS UNA VEZ AGREGADOS LOS OBJETOS
        for (int i = 0; i < listaUsuarios.size(); i++) {
        	//IMPRIMIR CON NUMERALES TIPO LISTA + SU NOMBRE USUARIO
            System.out.println((i + 1 + ". ") + listaUsuarios.get(i).getUsername());
            //IMPRIMIR LOS OBJETOS CON SUS ATRIBUTOS USANDO EL TO.STRING
            System.out.println(listaUsuarios.get(i).toString());
            System.out.println("");
        }
        //SEPARADOR DE LISTA 
        System.out.println("**********************************************************************************");
        System.out.println("Lista de estudiantes: ");
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println((i+1+". ") + listaAlumnos.get(i).getUsername());
            System.out.println(listaAlumnos.get(i).toString());
    		//LLAMA A LA FUNCION EN ALUMNO.JAVA
    		//IMPRIME DESDE ALUMNO.JAVA SEGUN EL VALOR DEL BOOLEAN ASISTENCIA
            System.out.println(listaAlumnos.get(i).alumnoPresente());
            System.out.println("");
        }
        //SEPARADOR DE LISTA
        System.out.println("**********************************************************************************");
        System.out.println("Lista de profesores: ");
        for (int i = 0; i < listaProfesores.size(); i++) {
            System.out.println((i+1+". ") + listaProfesores.get(i).getUsername());
            System.out.println(listaProfesores.get(i).toString());
            System.out.println("");
        }
        //PIE DE PAGINA CIERRE
        System.out.println("**********************************************************************************");		
	}
}
