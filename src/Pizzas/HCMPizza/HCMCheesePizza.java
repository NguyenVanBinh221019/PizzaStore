package Pizzas.HCMPizza;

import Pizzas.Base.Pizza;

public class HCMCheesePizza extends Pizza {
    public HCMCheesePizza() {
        name = "HCM The best cheese pizza";
        dough = "HCM Very thing dough";
        sauce = "HCM Very spicy sauce";
        toppings.add("Black olives");
        toppings.add("Cheese");
    }

    @Override
    public void Box() {
        super.Box();
        System.out.println(dough);
    }
}
