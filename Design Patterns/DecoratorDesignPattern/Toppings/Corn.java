package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.pizza.BasePizza;

public class Corn extends ToppingDecorator{
    public Corn(BasePizza obj){
        this.p=obj;
    }
    @Override
    public int cost() {
        return this.p.cost()+10;
    }
}
