package day3_dataStrucdure;

import java.util.*;

/**
 * @Description: 数据结构 (集合框架 Collection)，限定词 Java
 * @author: daimin
 * @date: Create in 16:13 2019/2/27
 */
public class dataStrucdure {
    public static void main(String[] args) {
//        list();
//        set();
        map();
    }

    /**
    * ArrayList  VS LinkedList  有序
     *  同根同源 List（抽象接口） : ArrayList  靠索引找值，数组的存储，你懂吧；
     *                              LinkedList   因为是双向链表啊，【前驱：数据：后驱】；
     *                              Vector  向量， 这个也是数组，但是它加锁了（synchronized）,支持同步，加锁当然会影响效率了；
     *                              Stack  栈 ， FILO(先进后出的结构, 因为只有一个出口)， 经常对比的就是 堆 heap（FIFO），它是一根吸管
     *  */
    public static void list() {

        //这个叫向下转型
        List array = new ArrayList();
        List link = new LinkedList();

        //ArrayList 取值是通过索引， 通过add存值的话就会进入List接口, 而add()实际的实现细节被隐藏
        array.add("Array");
        System.out.println(array.get(0));

        //LinkedList
        link.add("Linked");
        System.out.println(link.get(0));

        Vector vector = new Vector();
        Stack stack = new Stack();

        vector.add("Vector");
        System.out.println(vector.get(0));

        //Stack  FILO，你记住了
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    /**
     * HashSet VS TreeSet   :  HashSet 依赖于 HashMap 来实现   无序 hashCode
     * 同根同源 Set (Set 不允许有重复元素): HashSet  不同步，至多可存一个null, 无序
     *  equals 判断是否重复                 TreeSet  (实现SortedSet 接口)  可排序
     */
    public static void set() {
        HashSet hashSet = new HashSet();
        TreeSet treeSet = new TreeSet();

        //compareTo
       hashSet.add(3);
       hashSet.add(1);
       hashSet.add(2);

        //out
        Iterator itHash = hashSet.iterator();
        while (itHash.hasNext()) {
            System.out.println(itHash.next());
        }
    }

    /**
     * HashMap  VS  HashTable  前者常用于单线程 ， 后者常用于多线程
     */
    public static void map() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", "daimin");
        hashMap.put("gender", "girl");
        System.out.println(hashMap.get("name"));

        //遍历 keySet
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
