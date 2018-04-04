package chapter2;


import chapter2.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
