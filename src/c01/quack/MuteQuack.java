package c01.quack;

/**
 * Created by xianghui on 2017/7/21.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
