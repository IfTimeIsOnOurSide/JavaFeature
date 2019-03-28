package day8_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

/**
 * @Description: 通过反射获取实体类属性和方法
 * @author: daimin
 * @date: Create in 19:15 2019/3/27
 */
public class reflectTest {
    public static void main(String[] args) {
        Student student = new Student("戴敏", 24, "female");

        Class clazz = student.getClass();
        System.out.println("Package ：" + clazz.getPackage() + "\n Name : " + clazz.getName());

        Class[] clazzs = clazz.getClasses();
        System.out.println(clazzs[0].getName() + "\n");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (int j = 0; j < methods.length; j++) {
            System.out.println(methods[j]);
        }

        //private 权限构造方法
//        Student stu = new Student("Jack");
        Constructor[] constructor = clazz.getDeclaredConstructors();
        Class[] params = {};
        for (int k = 0; k < constructor.length; k++) {
            if (constructor[k].getModifiers() == 2) {
                params = constructor[k].getParameterTypes();
                constructor[k].setAccessible(true);
            }
        }

        for (int n = 0; n < params.length; n++) {
            System.out.println(params[n]);
        }
    }
}
