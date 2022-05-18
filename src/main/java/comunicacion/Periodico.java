package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia=primicia;
		this.interpretacion=interpretacion;
		}
	
	public String getFecha() {return this.fecha;}
	public String getPrimicia() {return this.primicia;}
	public String getInterpretacion() {return this.interpretacion;}
	
	public void setFecha(String fecha) {this.fecha=fecha;}
	public void setPrimicia(String primicia) {this.primicia=primicia;}
	public void setInterpretacion(String interpretacion) {this.interpretacion=interpretacion;}
	
	public int palabrasTotales(int palabrasPagina) {
		return 10*this.getPaginas()*palabrasPagina;
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
		r+= this.getFecha() + '\n';
		r+= this.getPrimicia();
		return r;
	}
	
}
