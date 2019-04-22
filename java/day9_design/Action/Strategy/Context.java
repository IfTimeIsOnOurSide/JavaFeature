package day9_design.Action.Strategy;

/**
 * @Description: 环境类：持有一个策略类的引用，最终给客户端调用
 * @author: daimin
 * @date: Create in 19:11 2019/4/22
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
