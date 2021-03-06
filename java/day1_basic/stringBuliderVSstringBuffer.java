package day1_basic;

import java.lang.reflect.Field;

/**
 * @Description: 基础知识
 * @author: daimin
 * @date: Create in 17:44 2019/2/19
 */
public class stringBuliderVSstringBuffer {
    public static void main(String[] args) throws Exception {
//        staticString();
          buildVSbuffer();
    }

    /**
    * String不可变的原因
    */
    public static void staticString () throws Exception {
        String a = "abcd";
        System.out.println(a);
        a.replace("a", "mmmm");
        System.out.println(a);

        //反射 改变 String
        Field valueOfString = String.class.getDeclaredField("value");
        valueOfString.setAccessible(true);
        char[] valueCharArr = (char[]) valueOfString.get(a);
        valueCharArr[2] = 'M';
        System.out.println("改变之后的String : " + a);
    }

    /**
    *  StringBuilder VS StringBuffer
    *   Java5出现StringBuilder (不能同步，线程不安全，但是它快)
     *   synchronized 关键字
    */
    public static void buildVSbuffer () {
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();

        //启动100个线程
        for (int i = 0; i < 100; i++) {
            Runnable runable =() -> {
                for (int j = 0; j < 100; j++) {
                    builder.append("0");
                    buffer.append("0");
                    System.out.println(" builder: " + builder.length() + " buffer: " + buffer.length());

                }
            };
            new Thread(runable).start();
        }
    }
}
