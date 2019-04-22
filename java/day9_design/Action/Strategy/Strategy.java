package day9_design.Action.Strategy;

/**
 * @Description: 抽象策略类：定义一个公共接口，各种不同的算法以不同的方式实现这个接口，
 * 环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现
 * @author: daimin
 * @date: Create in 18:59 2019/4/22
 */
public interface Strategy {

    /**
     * 接口
     */
    void strategyMethod();
}
