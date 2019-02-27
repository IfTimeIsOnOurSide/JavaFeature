package day2_object.abstractVSinterface;

/**
 * @Description: 接口定义 : 只能由static final 修饰的变量
 *                             fun只能声明，不能有方法体
 * @author: daimin
 * @date: Create in 14:46 2019/2/27
 */
public interface interfaceExam {
    public static final String LOG = "2019-01-27";

    void getLog();
}
