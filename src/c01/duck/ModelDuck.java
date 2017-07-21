package c01.duck;

import c01.fly.FlyNoWay;
import c01.quack.Quack;

/**
 * Created by xianghui on 2017/7/21.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("模型鸭");
    }
}
