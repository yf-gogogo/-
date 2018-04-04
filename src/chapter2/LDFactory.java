package chapter2;


import chapter2.pizza.LDCheesePizza;
import chapter2.pizza.LDPepperPizza;
import chapter2.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
