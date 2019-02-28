package day4_generics;

import java.util.List;

/**
 * @Description: 泛型 T  类型通配符 ？
 * @author: daimin
 * @date: Create in 20:05 2019/2/27
 */
public class generics {

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5};
//        int[] intArr0 = {6,7,8,9,10};  会报错， int 是原始基础类型，需要装箱
        String[] strArr = {"green", "blue", "white", "yellow", "red"};
        printT(intArr);
        printT(strArr);

//        printNum(strArr);
        printNum(intArr);

        //泛型类
        genericsClass<Integer> intObj = new genericsClass<>(111);
        genericsClass<String> strObj = new genericsClass<>("daimin");

        System.out.println("intObj : " + intObj.getT() + "     strObj : " + strObj.getT());
    }

    /**
    * 泛型方法 定义： T 相当于是对象的子类，因此arr不能是原始的基础数据类型 int\float\double
     */
    public static < T > void printT (T[] arr) {
        for (T data : arr) {
            System.out.println(data);
        }
    }

    /**
    *  有界的泛型 : 比如下面的这个泛型只想让Number和它的子类使用 ， String不能使用它
     */
    public static <T extends Number> void printNum (T[] numArr) {
        for (T data : numArr) {
            System.out.println(data);
        }
    }

    /**
    * 类型通配符  ?
     */
    public static void getData(List<?> params) {
        System.out.println(params.get(0));
    }
}
