package com.fresh.milk.designMode.decorator;

/**
 * @Description
 * @Author ljg
 * @CreateDate 2021/9/15 14:43
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
