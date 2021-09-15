package com.fresh.milk.designMode.decorator;

/**
 * @Description
 * @Author ljg
 * @CreateDate 2021/9/15 15:12
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "DarkRoast coffee";
    }

    @Override
    public double cost() {
        return 20d;
    }
}
