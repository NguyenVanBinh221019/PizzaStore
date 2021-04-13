package Pizzas.HNPizza;

import Pizzas.Base.Pizza;

public class HNCheesePizza extends Pizza {
    public HNCheesePizza() {
        name = "HN The best cheese pizza";
        dough = "HN Very thing dough";
        sauce = "HN Very spicy sauce";
        toppings.add("Black olives");
        toppings.add("Cheese");
    }

    @Override
    public void Box() {
        super.Box();
        System.out.println(dough);
    }
}
