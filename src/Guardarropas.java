
public class Guardarropas {
	Prenda prendas[];
	
	
	public void agregarPrenda(String colorPrimario, String colorSecundario, String descripcion, String marca, String tela, String zona) {
		Prenda unaPrenda = new Prenda(colorPrimario, colorSecundario, descripcion, marca, tela, zona);
		int i = prendas.length;
		prendas[i] = unaPrenda;
		return;
	}
	
	public Prenda tomarPrenda(String zona, Prenda prenda) {
		int i = 0;
		if(prenda != null) { //posiciona el contador en la posicion correpondiente
			while( prenda.noEsIgual(prendas[i])) {
				i++;
			}
		}
		
		while(prendas[i] != null) { //recorre la lista para devolver una prenda superior 
			if(prendas[i].getZona() == zona) {
				return prendas[i];
			}
			i++;
		}
		return null; //devuelve null cuando no encuentra más
	}

	
}
