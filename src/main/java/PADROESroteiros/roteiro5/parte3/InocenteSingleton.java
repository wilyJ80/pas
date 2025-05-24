package PADROESroteiros.roteiro5.parte3;

public final class InocenteSingleton {
	private InocenteSingleton() {
	}

	public static InocenteSingleton getInstance() {
		return new InocenteSingleton();
	}
}
