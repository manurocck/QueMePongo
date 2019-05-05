
public class Usuario {
	Guardarropas guardarropas[];
	
	public Usuario() {
		guardarropas = new Guardarropas[5];
		guardarropas[0] = null;
		guardarropas[1] = null;
		guardarropas[2] = null;
		guardarropas[3] = null;
		guardarropas[4] = null;
	}
	
	public void agregarGuardarropas(Guardarropas unGuardarropas) {
		int i = 0;
		
		while(guardarropas[i]!=null) {
			i++;
		}
		
		guardarropas[i] = unGuardarropas;
		return;
	}
	
	public void analizarAtuendosGuardarropas() {
		int i = 0;
		Atuendo atuendoAux = new Atuendo();
		
		while( i < guardarropas.length && guardarropas[i]!=null ) {
			atuendoAux.setGuardarropas(guardarropas[i]);
			atuendoAux.atuendosPosibles();
			
			i++;
		}
	}

	public void mostrarGuardarropas() {
		int i = 0;
		while(guardarropas[i]!=null){
			System.out.println("");
			System.out.println("Guardarropas "+(i+1)+" :");
			guardarropas[i].mostrar();
			i++;
		}
		return;
	}

	public void crearGuardarropas() {
		// TODO Auto-generated method stub
		
	}
}
