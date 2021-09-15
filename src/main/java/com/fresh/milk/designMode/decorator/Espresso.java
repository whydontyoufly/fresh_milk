package com.fresh.milk.designMode.decorator;

/**
 * @Description
 * @Author ljg
 * @CreateDate 2021/9/15 14:58
 */
public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.2d;
    }
}
