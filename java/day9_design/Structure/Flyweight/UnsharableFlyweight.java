package day9_design.Structure.Flyweight;

/**
 * @Description: 非享元角色：不可以共享的外部状态，以参数的习惯使注入具体享元的相关方法中
 * @author: daimin
 * @date: Create in 14:21 2019/4/15
 */
public class UnsharableFlyweight {
    private String info;

    UnsharableFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
