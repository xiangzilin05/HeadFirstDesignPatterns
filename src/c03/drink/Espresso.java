package c03.drink;

import c03.Beverage;

/**
 * Created by Administrator on 2017/7/24.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
