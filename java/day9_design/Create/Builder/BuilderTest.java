package day9_design.Create.Builder;

/**
 * @Description: 建造者模式 ：将一个复杂对象的构造和它的表示分离，使相同的构造过程可以创建不同的表示
 *
 * 模式结构 ：1、产品 ：包含多个组成部件的复杂对象， 由具体建造者来创建各个减部件
 *            2、抽象建造者 ：包含创建产品各个子部件的抽象方法的接口，通常包含返回复杂产品的方法getResult()
 *            3、具体建造者 ：实现Builder接口， 完成复杂产品的各个部件的具体创建方法
 *            4、指挥者 ：调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息
 * @author: daimin
 * @date: Create in 19:07 2019/4/2
 */
public class BuilderTest {
    public static void main(String[] args) {
        BuilderAbstract builder1 = new ConcreteBuilder1();
        Director director1 = new Director(builder1);
        Product product1 = director1.construct();
        builder1.setPartA();
        product1.show();

        BuilderAbstract builder2 = new ConcreteBuilder2();
        Director director2 = new Director(builder2);
        Product product2 = director2.construct();
        builder2.setPartA();
        product2.show();
    }
}
