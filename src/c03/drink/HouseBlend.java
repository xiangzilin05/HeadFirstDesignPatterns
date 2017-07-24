package c03.drink;

import c03.Beverage;

/**
 * Created by Administrator on 2017/7/24.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
