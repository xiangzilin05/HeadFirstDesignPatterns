package c03.condiment;

import c03.Beverage;

/**
 * Created by Administrator on 2017/7/24.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Soy, " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
