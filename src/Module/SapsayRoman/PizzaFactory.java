package Module.SapsayRoman;

import java.util.HashMap;
import java.util.Map;
class PizzaFactory {
    private static final Map<String, Pizza> pizzaMap = new HashMap<>();
    static {
        pizzaMap.put("Margherita", new Margherita());
        pizzaMap.put("Pepperoni", new Pepperoni());
    }
    public static Pizza createPizza(String type) {
        Pizza pizza = pizzaMap.get(type);
        if (pizza != null) {
            return pizza;
        } else {
            System.out.println("Invalid pizza type");
            return null;
        }
    }
}
