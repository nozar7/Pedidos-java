import java.util.ArrayList;
public class TestOrders {
	public static void main(String[] args) {
		// Elementos del menu
		Item producto1 = new Item();
		producto1.name = "Capuchino";
		producto1.price = 12.00;
		
		Item producto2 = new Item();
		producto2.name = "Latte";
		producto2.price = 12.5;
		

		// Ordenar variables orden1, orden2, etc

		Order pedido2 = new Order();
		pedido2.name = "Pedido 2 - asiento 7";	
		pedido2.total = 789.00;
		pedido2.ready = false;
		
		Order pedido1 = new Order();
		pedido1.name = "Pedido 1 - asiento 1";
		pedido1.total = 267.00;
		pedido1.ready = true;
	
		// Simulaciones de aplicaciones 
		// Utiliza este codigo de ejemplo para probar las actualizaciones de varios pedidos

		System.out.printf("Nombre: %s\n", pedido1.name);
		System.out.printf("Total: %s\n", pedido1.total);
		System.out.printf("Esta listo: %s\n", pedido1.ready);

		System.out.printf("Nombre: %s\n", pedido2.name);
		System.out.printf("Total: %s\n", pedido2.total);
		System.out.printf("Esta listo: %s\n", pedido2.ready);
		
	}

}
