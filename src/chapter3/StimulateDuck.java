package chapter3;


import chapter3.duck.Duck;
import chapter3.duck.GreenHeadDuck;
import chapter3.duck.RedHeadDuck;

public class StimulateDuck {

	public static void main(String[] args) {

		Duck mGreenHeadDuck = new GreenHeadDuck();
		Duck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Fly();
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		mRedHeadDuck.Fly();
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.display();
		//mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
		//mRedHeadDuck.Fly();
		//mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
		//mRedHeadDuck.Quack();
	}

}
