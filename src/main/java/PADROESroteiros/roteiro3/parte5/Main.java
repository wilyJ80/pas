package PADROESroteiros.roteiro3.parte5;

public class Main {
	public static void main(String[] args) {
		var painel = new PainelDeControle();

		var tempSensor = new TemperaturaSensor();
		var pressaoSensor = new PressaoSensor();
		var umidadeSensor = new UmidadeSensor();

		tempSensor.addObserver(painel);
		pressaoSensor.addObserver(painel);
		umidadeSensor.addObserver(painel);

		tempSensor.setLeitura(35);
		tempSensor.setLeitura(42);

		pressaoSensor.setLeitura(90);
		pressaoSensor.setLeitura(105);

		umidadeSensor.setLeitura(50);
		umidadeSensor.setLeitura(20);
	}
}
