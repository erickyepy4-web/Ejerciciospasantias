package Inventario;

public class Producto {
		
		String nombre;
		Double precio;
		Double iva;
	   //Constructor
		public Producto(String nombre, double precio, double iva) {
			this.nombre= nombre;
			this.precio= precio;
			this.iva=iva;
		}
		
		public String calcularIva() {
			
			if(iva==null || iva==0) {
				
				return "\n el producto "+this.nombre +" no tine IVA.\n PRECIO:" + this.precio + "$";
			}else{
				
				return "\n El precio de "+ this.nombre+" con IVA es: "+ calcularPrecioIva()+ "$";
				
			}
		}
		
		private double calcularPrecioIva() {
			return (precio*(iva/100))+ precio ;
		}
		
		
		
		//ejemplo de REGEX
		public static boolean regex(){
			String email ="mama@daomina.com";
			boolean valido= email.matches(".*a$");
			
			return valido;
		}
		
	}



