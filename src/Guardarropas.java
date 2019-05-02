
public class Guardarropas {
	Prenda prendas[];
	
	public Guardarropas() {
		prendas = new Prenda[20];
		prendas[0] = null;		prendas[1] = null;		prendas[2] = null;
		prendas[3] = null;		prendas[4] = null;		prendas[5] = null;
		prendas[6] = null;		prendas[7] = null;		prendas[8] = null;		
		prendas[9] = null;		prendas[10] = null;		prendas[11] = null;
		prendas[12] = null;		prendas[13] = null;		prendas[14] = null;
		prendas[15] = null;		prendas[16] = null;		prendas[17] = null;
		prendas[18] = null;		prendas[19] = null;	
	
	}
	
	
	public void agregarPrenda(String colorPrimario, String colorSecundario, String descripcion, String marca, String tela, String zona) {
		Prenda unaPrenda = new Prenda(colorPrimario, colorSecundario, descripcion, marca, tela, zona);
		int i = 0;

		while(prendas[i]!=null) {
			i++;
		}
		
		prendas[i] = unaPrenda;
		return;
	}
	
	public Prenda tomarPrenda(String zona, Prenda prenda) {
		int i = 0;
		if(prenda != null) { //posiciona el contador en la posicion correpondiente
			while( prenda.noEsIgual(prendas[i]) ) {
				i++;
			}
		}
		
		i++;
		
		while(prendas[i] != null) { //recorre la lista superior para devolver una prenda superior 
			if(prendas[i].getZona() == zona) {
				return prendas[i];
			}
			i++;
		}
		return null; //devuelve null cuando no encuentra más
	}


	public void mostrar() {
		int i = 0;
		while(prendas[i] != null) {
			prendas[i].mostrar();
			i++;
		}
		return;
	}

	
}
