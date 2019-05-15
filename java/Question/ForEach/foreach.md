# 为什么不要在ForEach里面使用remove/add操作？

### 源文件：
```
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
```
### 编译后的class文件：
```
 public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("000");
        list.add("111");
        list.add("222");
        Iterator var2 = list.iterator();

        while(var2.hasNext()) {
            String it = (String)var2.next();
            if (it.equals("000")) {
                list.remove(it);
            }
        }

        System.out.println("newList : " + list);
    }
```
### 分析过程
编译后的class文件中是通过Iterator迭代器来进行删除操作的,
通过ArrayList集合中实现Iterator中的hasNext()方法判断，
cursor是下一个元素的索引位置，remove操作时，modCount（修改次数）会改变，
但没有同步改变size导致expectedModCount与实际modCount不一致，checkForComodification()检查不通过抛出异常。

#### （详见ArrayList源码 846~883行Itr内部内实现）

