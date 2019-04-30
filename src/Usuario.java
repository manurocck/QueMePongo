
public class Usuario {
	Guardarropas guardarropas[];
	
	public void agregarGuardarropas(Guardarropas unGuardarropas) {
		int i = guardarropas.length;
		guardarropas[i] = unGuardarropas;
		return;
	}
	
	public void analizarAtuendosGuardarropas() {
		int i = 0;
		while(guardarropas[i]!=null) {
			Atuendo atuendoAux = new Atuendo(guardarropas[i]);
			atuendoAux.atuendosPosibles();
			i++;
		}
	}
}
