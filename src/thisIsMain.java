
public class thisIsMain {
	public static void main(String [ ] args)
	{		
		Usuario manu = new Usuario();
		
		Guardarropas unGuardarropas = new Guardarropas();

		unGuardarropas.agregarPrenda("Negro","","Anteojos de sol favoritos","","","Accesorio");
		unGuardarropas.agregarPrenda("Azul","","Remera Mangas Cortas Azul","","","Superior");
		unGuardarropas.agregarPrenda("Verde","","Pantalon regalo mamá","","","Inferior");
		unGuardarropas.agregarPrenda("Rojo","","Zapatillas Converse","Converse","","Calzado");
		unGuardarropas.agregarPrenda("Verde","","Pañuelo verde","","","Accesorio");
		unGuardarropas.agregarPrenda("Gris","Rojo","Remera mangas largas rayada","","","Superior");
		unGuardarropas.agregarPrenda("Azul","","Pantalon de jean","","Jean","Inferior");
		unGuardarropas.agregarPrenda("Negro","","Botas de cuero","","Cuero","Calzado");
		unGuardarropas.agregarPrenda("Blanco","","Musculosa de Mickey","","","Superior");
		unGuardarropas.agregarPrenda("Amarillo", "","Pollera Amarilla","","","Inferior");
		unGuardarropas.agregarPrenda("Azul","","Crocs","","Goma","Calzado");
		unGuardarropas.agregarPrenda("Rosa","","Gorra Rolling Stones","","","Accesorio");
		
		manu.agregarGuardarropas(unGuardarropas);
//		manu.mostrarGuardarropas();
		manu.analizarAtuendosGuardarropas();
	}
}
