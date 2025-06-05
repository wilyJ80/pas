package PADROESroteiros.roteiro6.parte4;

public class TesteSemFacade {
	public static void main(String[] args) {
		Database db = new Database();
		Cliente cli01 = new Cliente(1, "Jose");
		db.addCliente(cli01);
		CarrinhoCompra carrinho = new CarrinhoCompra();
		cli01.setCarrinho(carrinho);
		Produto p1 = db.selectProduto(1);
		Produto p2 = db.selectProduto(2);
		cli01.getCarrinho().addProduto(p1);
		cli01.getCarrinho().addProduto(p2);
		double total = cli01.getCarrinho().getTotalCompra();
		db.processarPagamento(cli01, total);
	}
}
