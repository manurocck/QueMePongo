
public class Prenda {
	
	String colorPrimario;
	String colorSecundario;
	String marca;
	String descripcion;
	String tela;
	String zona;
	
	//constructor
	public Prenda(String colorP, String colorS, String descrip, String marc, String tel, String zon) {
		colorPrimario = colorP;
		colorSecundario = colorS;
		marca = marc;
		descripcion = descrip;
		tela = tel;
		zona = zon;
		return;
	}
	
	public boolean noEsIgual(Prenda prenda) {
		if(prenda.getColorPrimario() == colorPrimario) {
			if(prenda.getColorSecundario() == colorSecundario) {
				if(prenda.getMarca() == marca) {
					if(prenda.getDescripcion() == descripcion) {
						if(prenda.getTela() == tela) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	

	
	
	public String getColorPrimario() {
		return colorPrimario;
	}
	public String getColorSecundario() {
		return colorSecundario;
	}
	public String getZona() {
		return zona;
	}
	private String getTela() {
		return tela;
	}
	private String getDescripcion() {
		return descripcion;
	}
	private String getMarca() {
		return marca;
	}

	public void mostrar() {
		System.out.println( getDescripcion() );
	}
}
