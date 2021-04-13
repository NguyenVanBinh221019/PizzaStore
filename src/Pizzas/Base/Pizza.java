package Pizzas.Base;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String>toppings = new ArrayList<String>();

    public void Prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (String i:toppings) {
            System.out.println(i);
        }
    }

    public void Bake() {
        System.out.println("Baking " + name + "in 30 minus");
    }

    public void Cut() {
        System.out.println("Cutting " + name);
    }

    public void Box() {
        System.out.println("Boxing " + name);
    }
}
