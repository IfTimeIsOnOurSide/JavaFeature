package day9_design.Create.Builder;

/**
 * @Description: 产品
 * @author: daimin
 * @date: Create in 19:27 2019/4/2
 */
public class Product {
    private String A;
    private String B;

    public void setA(String a) {
        A = a;
    }

    public void setB(String b) {
        B = b;
    }

    public void show() {
        System.out.println(A);
    }
}
