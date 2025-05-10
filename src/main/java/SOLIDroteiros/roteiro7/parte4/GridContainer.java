package SOLIDroteiros.roteiro7.parte4;

import java.util.Arrays;

public class GridContainer extends Container {

	protected Component[][] elements;
	private int lineCounter = 0;
	private int columnCounter = 0;
	private int columnMax;
	private int lineMax;

	public GridContainer(int columnMax, int lineMax) {
		this.columnMax = columnMax;
		this.lineMax = lineMax;

		this.elements = new Component[lineMax][columnMax];
	}

	public GridContainer(int columnMax, int lineMax, Borda borda) {
		this.columnMax = columnMax;
		this.lineMax = lineMax;
		super.borda = borda;

		this.elements = new Component[lineMax][columnMax];
	}

	@Override
	public void addComponent(Component c) {
		if (this.lineCounter == this.lineMax && this.columnCounter == this.columnMax) {
			System.out.println("Nao e possivel adicionar novos elementos");
		} else {
			this.elements[this.lineCounter][this.columnCounter] = c;
			this.columnCounter++;
			if (columnCounter == this.columnMax) {
				this.lineCounter++;
				if (this.lineCounter < this.lineMax) {
					this.columnCounter = 0;
				}
			}
		}
	}

	@Override
	public void removeComponent(Component c) {
		for (int i = 0; i < this.lineMax; i++) {
			for (int j = 0; j < this.columnMax; j++) {
				if (this.elements[i][j] == c) {
					this.elements[i][i] = null;
				}
			}
		}
	}

	@Override
	public void doLayout() {
		System.out.println("O container utilizado e o GridContainer");
		if (this.borda != null) {
			this.borda.gerarBorda();
		}
		System.out.println("Estes sao os elementos presentes no container");
		System.out.println(Arrays.deepToString(elements));
		System.out.println("Usando o metodo dispose como heranca para fechar o container");
		this.dispose();
		System.out.println("-----------------------------");
	}

}
