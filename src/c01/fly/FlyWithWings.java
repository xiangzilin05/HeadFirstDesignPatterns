package c01.fly;

/**
 * Created by xianghui on 2017/7/21.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子飞行");
    }
}
