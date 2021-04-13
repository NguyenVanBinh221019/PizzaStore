package Pizzas.DNPizza;

import Pizzas.Base.Pizza;

public class DNCheesePizza extends Pizza {
    public DNCheesePizza() {
        name = "DN The best cheese pizza";
        dough = "DN Very thing dough";
        sauce = "DN Very spicy sauce";
        toppings.add("Black olives");
        toppings.add("Cheese");
    }

    @Override
    public void Box() {
        super.Box();
        System.out.println(dough);
    }
}
