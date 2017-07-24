package c03.condiment;

import c03.Beverage;

/**
 * Created by Administrator on 2017/7/24.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Whip, " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
