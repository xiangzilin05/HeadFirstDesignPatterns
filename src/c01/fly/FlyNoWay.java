package c01.fly;

/**
 * Created by xianghui on 2017/7/21.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
