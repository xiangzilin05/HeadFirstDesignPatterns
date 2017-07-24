package c03.drink;

import c03.Beverage;

/**
 * Created by Administrator on 2017/7/24.
 */
public class Decaf extends Beverage {
    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
