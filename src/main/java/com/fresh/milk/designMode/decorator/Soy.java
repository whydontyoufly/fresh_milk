package com.fresh.milk.designMode.decorator;

/**
 * @Description
 * @Author ljg
 * @CreateDate 2021/9/15 15:02
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+1d;
    }
}
