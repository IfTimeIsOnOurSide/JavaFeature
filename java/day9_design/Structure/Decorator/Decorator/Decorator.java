package day9_design.Structure.Decorator.Decorator;

import day9_design.Structure.Decorator.Component.Component;

/**
 * @Description: 抽象装饰：继承抽象构件，包含具体构件实例，通过具体装饰为具体构件增加额外功能
 * @author: daimin
 * @date: 2019/4/10
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component com) {
        this.component = com;
    }

    @Override
    public void operator() {
        component.operator();
    }
}
