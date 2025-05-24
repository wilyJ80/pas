package PADROESroteiros.roteiro4.parte2;

import PADROESroteiros.roteiro4.parte2.novaarma.ShotGun;

public final class ShotGunAdapter extends ShotGun implements Arma {
	@Override
	public void carregar() {
		this.loadGun();
	}

	@Override
	public void atirar() {
		this.shotKill();
	}

	@Override
	public void mirar() {
		this.targetEnemy();
	}
}
