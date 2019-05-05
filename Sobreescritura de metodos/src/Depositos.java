
public class Depositos implements Comparable<Depositos> {
	private String nombre;
	private int ancho;
	private int largo;
	private int alto;
	
public Depositos(String nombre, int ancho, int largo, int alto) {
		super();
		this.nombre = nombre;
		this.ancho = ancho;
		this.largo = largo;
		this.alto = alto;
	}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getAncho() {
	return ancho;
}

public void setAncho(int ancho) {
	this.ancho = ancho;
}

public int getLargo() {
	return largo;
}

public void setLargo(int largo) {
	this.largo = largo;
}

public int getAlto() {
	return alto;
}

public void setAlto(int alto) {
	this.alto = alto;
}

@Override
public int compareTo(Depositos otroDeposito) {
	
	int dep1=this.getAlto()*this.getLargo()*this.getAncho();
	
	int dep2= otroDeposito.getAlto()*otroDeposito.getLargo()*otroDeposito.getAncho();
	
	int valorDevuelto = 0;
	
	if( dep1 > dep2)valorDevuelto=1;
	if(dep1 < dep2)valorDevuelto=-1;
	if( dep1 == dep2)valorDevuelto=0;

	return valorDevuelto;
}
	


}
