package DecoratorDesignPattern;
import DecoratorDesignPattern.Toppings.ExtraCheese;
import DecoratorDesignPattern.Toppings.Jalapeno;
import DecoratorDesignPattern.pizza.BasePizza;
import DecoratorDesignPattern.pizza.VegDelightPizza;

public class Main {
    public static void main(String[] args) {
        BasePizza p = new ExtraCheese(new Jalapeno(new ExtraCheese(new VegDelightPizza())));
        System.out.println("Pizza cost: "+p.cost());
    }
}