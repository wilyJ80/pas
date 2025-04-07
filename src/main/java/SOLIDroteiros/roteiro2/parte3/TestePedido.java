package SOLIDroteiros.roteiro2.parte3;

import java.util.Arrays;
import java.util.List;

public class TestePedido {
	public static void main(String[] args) {

		List<String> produtos = Arrays.asList("Camiseta", "Calca", "Jaqueta");

		PedidoService services[] = {
				new PedidoService(produtos, new DescontoPadrao()),
				new PedidoService(produtos, new DescontoVIP()),
		};

		for (PedidoService service : services) {
			service.processarPedido();
		}
	}
}
