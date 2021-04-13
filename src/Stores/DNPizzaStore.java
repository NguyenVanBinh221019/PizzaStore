package Stores;

import Pizzas.Base.Pizza;
import Pizzas.DNPizza.DNCheesePizza;
import Pizzas.DNPizza.DNGreekPizza;
import Pizzas.DNPizza.DNPepperoniPizza;
import Stores.Base.PizzaStore;
public class DNPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "Cheese" :
                return new DNCheesePizza();
            case "Greek" :
                return new DNGreekPizza();
            case "Pepperoni" :
                 return new DNPepperoniPizza();
            default:
                System.out.println("We do not have: " + type);
                return null;
        }
    }
}
