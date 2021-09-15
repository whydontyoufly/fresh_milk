package com.fresh.milk.designMode.observer;

/**
 * @Description 观察者顶层接口
 * @Author ljg
 * @CreateDate 2021/9/15 11:21
 */
public interface Observer {
    /**
     * 当订阅的主题发生变化时，调用该方法向观察者推送数据
     */
    void update(float temp, float humidity, float pressure);
}
