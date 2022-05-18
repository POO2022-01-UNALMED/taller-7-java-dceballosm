package comunicacion;

public class Alfabeto extends Pictograma{
	public static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public String[] getLetras() {
		return Alfabeto.letras;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return Alfabeto.letras.length;
	}
	public String interpretacion() {
		return interpretacion;
	};
/*
	public String toString() {
		String r = "";
		for(int i=0; i<this.letras.length; i++) {
			r = r + this.letras[i];
			if(i!=this.letras.length-1) {
				r = r + ", ";
			}
		}
		return r;
	}
*/
	public String toString() {
		// TODO Auto-generated method stub
		return "A" + ", " + "B" + ", " +"C" + ", " +"D" + ", " +"E" + ", " +"F" + ", " +"G" + ", " +
				"H" + ", " + "I" + ", " +"J" + ", " +"K" + ", " +"L" + ", " +"M" + ", " +"N" + ", " +
				"O" + ", " +"P" + ", " +"Q" + ", " + "R" + ", " +"S" + ", " +"T" + ", " +"U" + ", " +
				"V" + ", " +"W" + ", " +"X" + ", " +"Y" + ", " +"Z" ;
		
	}
}
