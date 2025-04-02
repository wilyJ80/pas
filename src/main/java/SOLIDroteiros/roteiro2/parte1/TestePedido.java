package SOLIDroteiros.roteiro2.parte1;

import java.util.Arrays;

public class TestePedido {
	public static void main(String[] args) {
		PedidoService pedido = new PedidoService(Arrays.asList("Camiseta", "Calca", "Jaqueta"));
		pedido.processarPedido(0.1);
		pedido.processarPedido(0.0);
		pedido.processarPedido(0.4);
	}
}
