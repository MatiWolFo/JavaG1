package com.generation.F220602.models.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.F220602.models.Alumno;

class AlumnoTest {
	@Test
	//CREAR FUNCION PARA TESTEAR Y PONER UN NOMBRE
	void testAsistenciAlumnoTRUE() {
		//CREAR INSTANCIA PARA SER USADA SOLO EN TEST
		Alumno testAlumno = new Alumno();	
		//LLAMAR A LA FUNCION CON VALOR (EN ESTE CASO BOOLEANO true)
		testAlumno.setAsistencia(true);
		//REGISTRAR EL RESULTADO EN UNA VARIABLE SOLO EN TEST
		String resultadoTest = testAlumno.alumnoPresente();
		//CREAR CONDICIONES DE TESTEO
		assertTrue(resultadoTest, true);
		assertNotNull(resultadoTest);
		assertEquals("PRESENTE", resultadoTest);
		assertNotEquals("AUSENTE", resultadoTest);
	}
	@Test
	//CREAR FUNCION PARA TESTEAR Y PONER UN NOMBRE
	void testAsistenciAlumnoFALSE() {
		//CREAR INSTANCIA PARA SER USADA SOLO EN TEST
		Alumno testAlumno2 = new Alumno();	
		//LLAMAR A LA FUNCION CON VALOR (EN ESTE CASO BOOLEANO false)
		testAlumno2.setAsistencia(false);
		//REGISTRAR EL RESULTADO EN UNA VARIABLE SOLO EN TEST
		String resultadoTest2 = testAlumno2.alumnoPresente();
		//CREAR CONDICIONES DE TESTEO
		assertFalse(resultadoTest2, false);
		assertNotNull(resultadoTest2);
		assertEquals("AUSENTE", resultadoTest2);
		assertNotEquals("PRESENTE", resultadoTest2);
	}
}
