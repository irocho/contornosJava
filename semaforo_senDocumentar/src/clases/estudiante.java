package clases;


public class estudiante extends persona {
	int i_Curso;


	public estudiante(int iEdad, String sNombre, int iCurso) {
		i_Edad = iEdad;
		s_Nombre = sNombre;
		i_Curso = iCurso;
	}

	public void presentarse() {
		System.out.println("Soy " + s_Nombre + " Alumno de " + i_Curso + " y tengo una edad de: "
				+ i_Edad);
	}


	public String preguntacolor() {
		presentarse();
		ordenador mipc = new ordenador();
		return mipc.color();
	}
}
