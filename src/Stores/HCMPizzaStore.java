package Stores;

import Pizzas.Base.Pizza;
import Pizzas.HCMPizza.HCMCheesePizza;
import Pizzas.HCMPizza.HCMGreekPizza;
import Pizzas.HCMPizza.HCMPepperoniPizza;
import Stores.Base.PizzaStore;

public class HCMPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "Cheese" :
                return new HCMCheesePizza();
            case "Greek" :
                return new HCMGreekPizza();
            case "Pepperoni" :
                return new HCMPepperoniPizza();
            default:
                System.out.println("We do not have: " + type);
                return null;
        }
    }
}
