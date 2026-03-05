package principal;
import clases.profesor;


public class clasecolor {
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		profesor teacher = new profesor();
		String color = teacher.preguntacolor();
		System.out.println("La respuesta recibida es:" + color);
	} 
}
