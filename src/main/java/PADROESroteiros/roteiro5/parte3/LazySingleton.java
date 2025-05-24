package PADROESroteiros.roteiro5.parte3;

public final class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
