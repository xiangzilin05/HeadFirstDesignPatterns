package c01.quack;

/**
 * Created by xianghui on 2017/7/21.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
