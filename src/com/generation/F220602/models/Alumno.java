package com.generation.F220602.models;

public class Alumno extends Usuario {
	 	//CREAR ATRIBUTOS ALUMNO
		private Integer idAlumno;
	    private String cursoAlumno;
	    private Boolean asistencia;
	    private String asignatura;

	    public Alumno() {
	        super();
	    }

	    public Alumno(Integer id_alum, String curso, Boolean asistencia, String asignatura) {
	        this.idAlumno = id_alum;
	        this.cursoAlumno = curso;
	        this.asistencia = asistencia;
	        this.asignatura = asignatura;
	    }

	    public Integer getId_alum() {
	        return idAlumno;
	    }

	    public void setId_alum(Integer id_alum) {
	        this.idAlumno = id_alum;
	    }

	    public String getCurso() {
	        return cursoAlumno;
	    }

	    public void setCurso(String curso) {
	        this.cursoAlumno = curso;
	    }

	    public Boolean getAsistencia() {
	        return asistencia;
	    }

	    public void setAsistencia(Boolean asistencia) {
	        this.asistencia = asistencia;
	    }

	    public String getAsignatura() {
	        return asignatura;
	    }

	    public void setAsignatura(String asignatura) {
	        this.asignatura = asignatura;
	    }
	    //
		@Override
		public String toString() {
			return super.toString() + "\nidAlumno=" + idAlumno + "\ncurso=" + cursoAlumno + "\nasistencia=" + asistencia + "\nasignatura=" + asignatura;
		}
	    public String alumnoPresente() {
	        if (asistencia == true) {
	           return "PRESENTE";
	        }else
	            return "AUSENTE";
	        }
	    }

