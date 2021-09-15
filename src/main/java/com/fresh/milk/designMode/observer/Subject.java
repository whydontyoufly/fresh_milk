package com.fresh.milk.designMode.observer;

/**
 * @Description 可被订阅的主题
 * @Author ljg
 * @CreateDate 2021/9/15 11:23
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 主题发生改变时，会调用该方法，以通知所有观察者
     */
    void notifyObservers();
}
