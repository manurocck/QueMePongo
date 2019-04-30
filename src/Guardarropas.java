
public class Guardarropas {
	Prenda prendas[];
	
	public Prenda tomarPrendaSuperior(int posicionS) { //devuelve una prenda superior y sino hay, un null
		int i = 0;
		
		while(prendas[i] != null) {
			if(prendas[i].zona() == "Superior") {
				posicionS = i;
				return prendas[i];
			}
			i++;
		}
		
		return null;
	}

}
