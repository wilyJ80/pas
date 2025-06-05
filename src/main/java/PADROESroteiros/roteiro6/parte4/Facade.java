package PADROESroteiros.roteiro6.parte4;

public class Facade {
	private static Facade instanciaUnica;

	private Database db;
	private Cliente cliente;
	private Produto produto;

	private Facade() {
		this.db = new Database();
	}

	public static synchronized Facade getInstance() {
		if (instanciaUnica == null) {
			instanciaUnica = new Facade();
		}
		return instanciaUnica;
	}

	public void registrarCliente(String nome, int id) {
		this.cliente = new Cliente(id, nome);
		this.db.addCliente(this.cliente);
	}

	public void comprar(int productID, int clientID) {
		this.cliente = db.selectCliente(clientID);
		this.produto = db.selectProduto(productID);
		if (this.cliente != null && this.produto != null) {
			this.cliente.getCarrinho().addProduto(this.produto);
		} else {
			System.out.println("Cliente ou Produto não localizado.");
		}
	}

	public void finalizarCompra(int clientID) {
		this.cliente = db.selectCliente(clientID);
		if (this.cliente != null) {
			double total = this.cliente.calcularTotal();
			db.processarPagamento(cliente, total);
		} else {
			System.out.println("Cliente não encontrado para finalizar compra.");
		}
	}
}
