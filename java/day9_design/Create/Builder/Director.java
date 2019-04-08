package day9_design.Create.Builder;

/**
 * @Description: 指挥者
 * @author: daimin
 * @date: Create in 19:27 2019/4/2
 */
public class Director {
    private BuilderAbstract builder;
    public Director(BuilderAbstract builder) {
        this.builder = builder;
    }

    /**
     * 产品构建和组装
     */
    public Product construct() {
        builder.setPartA();
        builder.setPartB();

        return builder.getResult();
    }
}
