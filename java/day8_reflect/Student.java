package day8_reflect;

/**
 * @Description: 实体类  通过反射获取实体类属性和方法
 * @author: daimin
 * @date: Create in 19:12 2019/3/27
 */
public class Student {
    public String name;
    protected int age;
    private String gender;

    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public class hoppy{
        public String hoppy;

        public String getHoppy() {
            return hoppy;
        }

        public void setHoppy(String hoppy) {
            this.hoppy = hoppy;
        }
    }
}
