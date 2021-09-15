package com.fresh.milk.designMode.decorator;

/**
 * @Description
 * @Author ljg
 * @CreateDate 2021/9/15 14:59
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House blend coffee";
    }

    @Override
    public double cost() {
        return 0.9d;
    }
}
