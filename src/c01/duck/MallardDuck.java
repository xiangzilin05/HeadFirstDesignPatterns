package c01.duck;

import c01.fly.FlyWithWings;
import c01.quack.Quack;

/**
 * Created by xianghui on 2017/7/21.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("外观是绿头");
    }
}
