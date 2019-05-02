
public class Atuendo {
	Prenda superior = null;
	Prenda inferior = null;
	Prenda calzado = null;
	Prenda accesorio = null;
	Guardarropas guardarropa = null;
	
	public void setGuardarropas(Guardarropas guardarropas) {
		guardarropa = guardarropas;
		return;
	}
	

	
	public void imprimirAtuendo(int contador) {

		int posicion = contador + 1;
		System.out.println("--------------");
		System.out.println("Atuendo "+ posicion);
		System.out.println("--------------");
		System.out.println("Superior: " + superior.descripcion);
		System.out.println("Inferior: " + inferior.descripcion);
		System.out.println("Calzado: " + calzado.descripcion);
		System.out.println("Accesorio: " + accesorio.descripcion);
		
	}


	public void atuendosPosibles() { //combina suponiendo que tiene que tener sí o sí al menos algo puesto en cada posicion
		
		int i = 0;
		
		while( (superior = guardarropa.tomarPrenda("Superior", superior) )!=null ) {
			while( (inferior = guardarropa.tomarPrenda("Inferior", inferior))!=null) {
				while( (calzado = guardarropa.tomarPrenda("Calzado", calzado))!=null) {
					while( (accesorio = guardarropa.tomarPrenda("Accesorio", accesorio))!=null) {
						
						imprimirAtuendo(i);
						i++;
					}
					
				}
			}
		}
		
	}

}


//	public void atuendosPosibles() { //combina suponiendo que tiene que tener sí o sí al menos algo puesto en cada posicion
//		int i = 0;
//		
//		do{
//			superior = guardarropa.tomarPrenda("Superior", superior);
//			inferior = null;
//			calzado = null;
//			accesorio = null;
//			
//			do{
//				inferior = guardarropa.tomarPrenda("Inferior", inferior);
//				calzado = null;
//				accesorio = null;
//				
//				do {
//					calzado = guardarropa.tomarPrenda("Calzado", calzado);
//					accesorio = null;
//					
//					do {
//						accesorio = guardarropa.tomarPrenda("Accesorio", inferior);
//						
//						if(superior!=null && inferior!=null && calzado!=null && accesorio!=null) {
//							imprimirAtuendo(i);							
//						}
//						System.out.println("Soy : " + i);
//						
//						i++;
//					}while( accesorio!= null );
//					
//					System.out.println("Leyenda : " + i);
//				
//				}while( calzado!= null );
//
//				System.out.println("Point : " + i);
//
//			}while( inferior != null ); 
//						
//		}while( superior != null );
//		
//		superior = null;
//		inferior = null;
//		calzado = null;
//		accesorio = null;
//		return;
//	}