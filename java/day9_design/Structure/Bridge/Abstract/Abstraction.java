package day9_design.Structure.Bridge.Abstract;

import day9_design.Structure.Bridge.Implementor.Implementor;

/**
 * @Description: 抽象角色 ：定义抽象类，包含一个对实现化对象的引用
 * @author: daimin
 * @date: 2019/4/10
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor impl) {
        this.implementor = impl;
    }

    public abstract void operator();
}
