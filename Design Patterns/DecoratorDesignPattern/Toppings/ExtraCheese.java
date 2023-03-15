package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    public ExtraCheese(BasePizza obj){
        this.p=obj;
    }
    @Override
    public int cost() {
        return this.p.cost()+20;
    }
}
