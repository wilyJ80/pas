package PADROESroteiros.roteiro3.parte5;

public class PainelDeControle implements Observer {

	@Override
	public void update(Sensor sensor, double leitura) {
		String tipo = sensor.getTipoSensor();
		boolean alerta = false;

		switch (tipo) {
			case "Temperatura":
				if (leitura > 40)
					alerta = true;
				break;
			case "Pressão":
				if (leitura > 100)
					alerta = true;
				break;
			case "Umidade":
				if (leitura < 30)
					alerta = true;
				break;
		}

		System.out.println("[" + tipo + "] Leitura: " + leitura + (alerta ? " 🚨 ALERTA!" : ""));
	}
}
