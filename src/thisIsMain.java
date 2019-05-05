
public class thisIsMain {
	public static void main(String [ ] args)
	{		
		Usuario manu = new Usuario();
//		Usuario martin = new Usuario();

		Guardarropas guardarropasManu1 = new Guardarropas();
		Guardarropas guardarropasManu2 = new Guardarropas();
		
		
		manu.agregarGuardarropas(guardarropasManu1);
		manu.agregarGuardarropas(guardarropasManu2);

		
		
		guardarropasManu1.agregarPrenda("Negro","","Anteojos de sol favoritos","","","Accesorio");
		guardarropasManu1.agregarPrenda("Azul","","Remera Mangas Cortas Azul","","","Superior");
		guardarropasManu1.agregarPrenda("Verde","","Pantalon regalo mamá","","","Inferior");
		guardarropasManu1.agregarPrenda("Rojo","","Zapatillas Converse","Converse","","Calzado");
		guardarropasManu1.agregarPrenda("Verde","","Pañuelo verde","","","Accesorio");
		guardarropasManu1.agregarPrenda("Gris","Rojo","Remera mangas largas rayada","","","Superior");
		guardarropasManu1.agregarPrenda("Azul","","Pantalon de jean","","Jean","Inferior");
		guardarropasManu1.agregarPrenda("Negro","","Botas de cuero","","Cuero","Calzado");
		guardarropasManu1.agregarPrenda("Blanco","","Musculosa de Mickey","","","Superior");
		guardarropasManu1.agregarPrenda("Amarillo", "","Pollera Amarilla","","","Inferior");
		guardarropasManu1.agregarPrenda("Azul","","Crocs","","Goma","Calzado");
		guardarropasManu1.agregarPrenda("Rosa","","Gorra Rolling Stones","","","Accesorio");
		
		guardarropasManu2.agregarPrenda("Negro","","Primera Prenda","","","Inferior");
		guardarropasManu2.agregarPrenda("Verde","","Pantalon Camuflado","","","Inferior");
		guardarropasManu2.agregarPrenda("Amarillo","","Remera Pato Donald","","","Superior");
		guardarropasManu2.agregarPrenda("Azul","","Sombrero azul","","","Accesorio");
		guardarropasManu2.agregarPrenda("Rojo","","Pañuelo rojo garganta","Converse","","Accesorio");
		guardarropasManu2.agregarPrenda("Amarillo","","Campera de Tweety","","","Superior");
		guardarropasManu2.agregarPrenda("Azul","Rojo","Camiseta San Lorenzo","","","Superior");
		guardarropasManu2.agregarPrenda("Rojo","","Zapatillas Converse Rojas","","","Calzado");
		guardarropasManu2.agregarPrenda("Amarillo","","Botas de lluvia","","Cuero","Calzado");
		guardarropasManu2.agregarPrenda("Amarillo","","Piloto de lluvia","","","Superior");
		
		
		manu.mostrarGuardarropas();
		manu.analizarAtuendosGuardarropas();
	}
}
