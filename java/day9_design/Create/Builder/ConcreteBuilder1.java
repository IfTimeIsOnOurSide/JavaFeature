package day9_design.Create.Builder;

/**
 * @Description: 1号具体建造者
 * @author: daimin
 * @date: Create in 19:36 2019/4/2
 */
public class ConcreteBuilder1 extends BuilderAbstract {

    /**
     * 实现抽象建造者的抽象接口方法
     */
    @Override
    public void setPartA() {
        super.product.setA("1号具体建造者创建A部件");
    }
    @Override
    public void setPartB() {
        super.product.setB("1号具体建造者创建B部件");
    }
}
