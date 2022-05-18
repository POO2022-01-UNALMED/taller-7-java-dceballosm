package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza() {return this.ensenanza;}
	public String getInterpretacion() {return this.interpretacion;}
	
	public void setEnsenanza(String ensenanza) {this.ensenanza=ensenanza;}
	public void setInterpretacion(String interpretacion) {this.interpretacion=interpretacion;}
	
	public int palabrasTotales(int palabrasPagina) {
		return 1*this.getPaginas()*palabrasPagina;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String r = "";
		r+= this.getOrigen() + '\n';
		r+= this.getTitulo() + '\n';
		r+= this.getAutor() + '\n';
		r+= this.getPaginas()  + '\n';
		r+= this.getEnsenanza();
		return r;
	}
	
}
