package c03.condiment;

import c03.Beverage;

/**
 * Created by Administrator on 2017/7/24.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Milk, " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
