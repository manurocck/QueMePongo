
public class Prenda {
	
	String colorPrimario;
	String colorSecundario;
	String marca;
	String descripcion;
	String tela;
	
	public Prenda(String colorP, String colorS, String descrip, String marc, String tel) {
		colorPrimario = colorP;
		colorSecundario = colorS;
		marca = marc;
		descripcion = descrip;
		tela = tel;
		return;
	}
	public String zona() {
		
	}
	public boolean noEsIgual(Prenda prenda) {
		if(prenda.getColorPrimario() == colorPrimario) {
			if(prenda.getColorSecundario() == colorSecundario) {
				if(prenda.getMarca() == marca) {
					if(prenda.getDescripcion() == descripcion) {
						if(prenda.getTela() == tela) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	

	
	
	public String getColorPrimario() {
		return colorPrimario;
	}
	public String getColorSecundario() {
		return colorSecundario;
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
}
