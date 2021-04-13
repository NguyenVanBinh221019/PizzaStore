package Stores;

import Pizzas.Base.Pizza;
import Pizzas.HNPizza.HNCheesePizza;
import Pizzas.HNPizza.HNGreekPizza;
import Pizzas.HNPizza.HNPepperoniPizza;
import Stores.Base.PizzaStore;

public class HNPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "Cheese" :
                return new HNCheesePizza();
            case "Greek" :
                return new HNGreekPizza();
            case "Pepperoni" :
                return new HNPepperoniPizza();
            default:
                System.out.println("We do not have: " + type);
                return null;
        }
    }
}
