import Stores.Base.PizzaStore;
import Stores.DNPizzaStore;
import Stores.HNPizzaStore;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        String ch = new Scanner(System.in).nextLine();
        switch (ch) {
            case "HN" :
                  return;
        }
        PizzaStore pizzaStore = new DNPizzaStore();
        System.out.println("What pizza would you like eat ?");
        String type= new Scanner(System.in).nextLine();
        pizzaStore.OrderPizza(type);
    }

    public void Hn() {
        PizzaStore pizzaStore = new HNPizzaStore();
        System.out.println("What pizza would you like eat ?");
        String type= new Scanner(System.in).nextLine();
        pizzaStore.OrderPizza(type);
    }
}
