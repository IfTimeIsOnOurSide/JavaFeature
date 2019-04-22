package day9_design.Action.Strategy;

/**
 * @Description: 策略模式测试
 * @author: daimin
 * @date: Create in 19:09 2019/4/22
 */
public class StrategyTest {
    public static void main(String[] args) {
        Strategy strategy1 = new ConcreteStrategy1();
        Context context = new Context();
        context.setStrategy(strategy1);
        context.strategyMethod();

        System.out.println("**********************");
        strategy1 = new ConcreteStrategy2();
        context.setStrategy(strategy1);
        context.strategyMethod();
    }
}
