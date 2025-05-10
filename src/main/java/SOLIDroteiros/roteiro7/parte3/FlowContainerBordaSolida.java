package SOLIDroteiros.roteiro7.parte3;

public class FlowContainerBordaSolida extends FlowContainer {

	public FlowContainerBordaSolida() {
		super();
	}

	@Override
	public void doLayout() {
		System.out.println("O Container utilizado e o FlowContainer");
		System.out.println("Este container contem bordas solidas");
		System.out.println("Estes sao os elementos presentes no container");
		System.out.println(super.elements);
		System.out.println("Usando o metodo dispose como heranca para fechar o container");
		this.dispose();
		System.out.println("------------------------------------");
	}
}
