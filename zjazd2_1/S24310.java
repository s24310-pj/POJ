package gamers;

import main.Pair;
import main.Unit;

public class S24310 extends Unit {

	public S24310(final String id, final Pair<Double, Double> position, final double rotate,
			final CollisionModel model) {
		super(id, position, rotate, model);
	}

	@Override
	public void run() {
		this.enableStopOnWall();
		this.forward();
		this.enableMovement();
		while (true) {
			if (this.nearestCollision() <= 1) {
				if (this.whatIsInRange() == 3) {
					this.attackInNextMove();
				} else if (this.whatIsInRange() == 1 || this.whatIsInRange() == 2) {
					this.rotateBy(90);
					this.forward();
				}
			} else {
				this.forward();
			}

		}
	}

}
