
public class Atuendo {
	Prenda superior = null;
	Prenda inferior = null;
	Prenda calzado = null;
	Prenda accesorio = null;
	Guardarropas guardarropa = null;
	
	public Atuendo(Guardarropas guardarropas) {
		guardarropa = guardarropas;
	}
	

	public void atuendosPosibles() { //combina suponiendo que tiene que tener sí o sí al menos algo puesto en cada posicion
		int i = 0;
		
		while( (superior = guardarropa.tomarPrenda("Superior", superior))!= null ){
			while( (inferior = guardarropa.tomarPrenda("Inferior", inferior))!= null ) {
				while( (calzado = guardarropa.tomarPrenda("Calzado", calzado))!= null ) {
					while( (accesorio = guardarropa.tomarPrenda("Accesorio", inferior))!= null ) {
						
						imprimirAtuendo(i);
						
						i++;
					} accesorio = null;
				} calzado = null;
			} inferior = null;
		} superior = null;

	}
	
	public void imprimirAtuendo(int contador) {

		int posicion = contador + 1;
		System.out.println("Atuendo "+ posicion +":");
		System.out.println("Superior :" + superior.descripcion);
		System.out.println("Inferior :" + inferior.descripcion);
		System.out.println("Calzado :" + calzado.descripcion);
		System.out.println("Accesorio :" + accesorio.descripcion);
		
	}

}
