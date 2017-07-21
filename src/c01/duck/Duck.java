package c01.duck;

import c01.fly.FlyBehavior;
import c01.quack.QuackBehavior;

/**
 * Created by xianghui on 2017/7/21.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    /**
     * 呱呱叫
     */
//    public void quack(){}
    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("鸭子都会游泳");
    }

    /**
     * 外观
     */
    public abstract void display();

    /**
     * 会飞
     */
//    public void fly(){}
    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
