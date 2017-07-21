package c01;

import c01.duck.Duck;
import c01.duck.MallardDuck;
import c01.duck.ModelDuck;
import c01.fly.FlyRocket;

/**
 * Created by xianghui on 2017/7/21.
 */
public class Hello {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("===============================================");
        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocket());
        model.performFly();
    }
}
