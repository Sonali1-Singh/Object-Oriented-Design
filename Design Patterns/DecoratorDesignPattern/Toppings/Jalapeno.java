package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.pizza.BasePizza;

public class Jalapeno extends ToppingDecorator{
    public Jalapeno(BasePizza obj){
        this.p=obj;
    }
    @Override
    public int cost() {
        return this.p.cost()+30;
    }
}
