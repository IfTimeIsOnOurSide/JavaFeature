package Question.ForEach;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 不要在foreach里面使用remove/add操作
 * @author: daimin
 * @date: Create in 11:16 2019/4/30
 */
public class Foreach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("000");
        list.add("111");
        list.add("222");

        for (String it : list) {
            if (it.equals("000")) {
                list.remove(it);
            }
        }
        System.out.println("newList : " + list);
    }
}
