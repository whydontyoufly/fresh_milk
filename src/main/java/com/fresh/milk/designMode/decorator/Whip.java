package com.fresh.milk.designMode.decorator;

/**
 * @Description
 * @Author ljg
 * @CreateDate 2021/9/15 15:04
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.87d;
    }
}
