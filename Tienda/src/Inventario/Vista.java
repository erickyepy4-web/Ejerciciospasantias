package Inventario;

public class Vista {

	public static void main(String[] args) {
		Producto nestle = new Producto("café",10, 15);
	 	System.out.println(nestle.calcularIva());
	 	Producto lacteo = new Producto("leche",20,0);
	 	System.out.println(lacteo.calcularIva());

	}

}
