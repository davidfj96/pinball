package actores;

import com.badlogic.gdx.physics.box2d.World;

import behaviors.BallBehavior;
import behaviors.BumperABehavior;
import behaviors.MyBehavior;
import behaviors.TodosBotonesBehavior;
import bodies.BallBody;
import bodies.BumperABody;
import fixturas.BallFixture;
import fixturas.BumperAFixture;
import interfaces.IObservador;

public class BumperA extends MyActor{

	public BumperA(World world, float posX, float posY, TodosBotonesBehavior Behavior) {
		super(world, posX, posY);
		myBody = new BumperABody(world, posX, posY);
		myBody.myBehavior = new BumperABehavior(myBody);
		Behavior.addObserver((IObservador) myBody.myBehavior);
		myFixture = new BumperAFixture(myBody);
	}


}
