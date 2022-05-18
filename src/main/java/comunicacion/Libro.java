package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	public String getCo_autor() {return this.co_autor;}
	public String getEditorial() {return this.editorial;}
	public String getEdicion() {return this.edicion;}
	public String getInterpretacion() {return this.interpretacion;}
	public void setCo_autor(String co_autor) {this.co_autor = co_autor;}
	public void setEditorial(String editorial) {this.editorial = editorial;}
	public void setEdicion(String edicion) {this.edicion =edicion;}
	public void setInterpretacion(String interpretacion) {this.interpretacion = interpretacion;}
	
	public int palabrasTotales(int palabrasPagina) {
		return 2*this.getPaginas()*palabrasPagina;
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
		r+= this.getCo_autor() + '\n';
		r+= this.getEditorial() + '\n';
		r+= this.getEdicion();
		return r;
	}
	
	
}
