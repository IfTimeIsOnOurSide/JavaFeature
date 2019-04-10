package day9_design.Structure.Decorator.Component;

import day9_design.Structure.Decorator.Component.Component;

/**
 * @Description: 具体构件：实现抽象构件，通过装饰器增加额外功能
 * @author: daimin
 * @date: 2019/4/10
 */
public class ConcreteComponent implements Component {

    @Override
    public void operator() {
        System.out.println("具体构件里面实现抽象构件的方法");
    }
}
