package clases;


public class profesor extends persona {
	public profesor() {
	} 

	public String preguntacolor() {

		estudiante alumno = new estudiante(20,"Noa",1);
		String colorRec = alumno.preguntacolor();
		return colorRec;
	}
}
