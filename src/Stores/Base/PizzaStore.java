package Stores.Base;

import Pizzas.Base.Pizza;

public abstract class PizzaStore {
    public void OrderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        
        pizza.Prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();
    }

    protected abstract Pizza createPizza(String type);
}
