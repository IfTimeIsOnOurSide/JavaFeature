package day4_generics;

/**
 * @Description: 泛型类的定义
 * @author: daimin
 * @date: Create in 11:15 2019/2/28
 */
public class genericsClass<T> {
    private T t;

    genericsClass (T t) {
        this.t = t;
    }

    public T getT () {
        return t;
    }
}
