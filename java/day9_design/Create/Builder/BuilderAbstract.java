package day9_design.Create.Builder;

/**
 * @Description: 抽象建造者
 * @author: daimin
 * @date: Create in 19:30 2019/4/2
 */
public abstract class BuilderAbstract {

    protected Product product = new Product();

    //创建产品子部件的抽象方法接口
    public abstract void setPartA();
    public abstract void setPartB();

    //返回产品
    public Product getResult(){
        return product;
    }

}
