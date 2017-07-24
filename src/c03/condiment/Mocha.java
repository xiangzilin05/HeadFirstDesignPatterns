package c03.condiment;

import c03.Beverage;

/**
 * Created by Administrator on 2017/7/24.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Mocha, " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
