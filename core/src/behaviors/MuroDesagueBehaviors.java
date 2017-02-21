package behaviors;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;

import bodies.MyBody;

public class MuroDesagueBehaviors extends MyBehavior {

	public boolean desactivar = false;

	public MuroDesagueBehaviors(MyBody myBody) {
		super(myBody);
	}

	@Override
	public void act(float delta) {
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		if (!desactivar) {
			myBody.sprite.draw(batch);
			myBody.body.setActive(true);
		} else {
			myBody.body.setActive(false);
		}
	}

	@Override
	public void chocar(Body bolaBody) {
		super.chocar(bolaBody);
			desactivar = true;
			bolaBody.applyLinearImpulse(new Vector2(0.1f, 0.9f), myBody.body.getWorldCenter(), true);
	}

}
