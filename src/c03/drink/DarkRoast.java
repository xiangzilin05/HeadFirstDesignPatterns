package c03.drink;

import c03.Beverage;

/**
 * Created by Administrator on 2017/7/24.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
