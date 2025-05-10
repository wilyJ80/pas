package SOLIDroteiros.roteiro7.parte3;

import java.util.Arrays;

public final class GridContainerBordaSolida extends GridContainer {

	public GridContainerBordaSolida(int columnMax, int lineMax) {
		super(lineMax, lineMax);
	}

	@Override
	public void doLayout() {
		System.out.println("O container utilizado e o GridContainer");
		System.out.println("Estes sao os elementos presentes no container");
		System.out.println(Arrays.deepToString(elements));
		System.out.println("Usando o metodo dispose como heranca para fechar o container");
		this.dispose();
		System.out.println("-----------------------------");
	}

}
