package Module.SapsayRoman;

public class Main {
    public static void main(String[] args) {
        Pizza margherita = PizzaFactory.createPizza("Margherita");
        margherita.prepare();
        margherita.bake();
        margherita.cut();
        margherita.box();

        Pizza pepperoni = PizzaFactory.createPizza("Pepperoni");
        pepperoni.prepare();
        pepperoni.bake();
        pepperoni.cut();
        pepperoni.box();
    }
}
