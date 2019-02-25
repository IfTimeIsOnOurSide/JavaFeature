package day1_basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: 正则表达式
 * @author: daimin
 * @date: Create in 21:28 2019/2/23
 */
public class regex {
    public static void main(String[] args) {
        regexContent();
    }

    /**
    * 正则表达式组成
     * 1、原义字符
     * 2、非打印字符 （\n \r \t \v ……）
     * 3、元字符 （* + ? $ ^ . | \ () {} []）
     */
    public static void regexContent() {
        //量词
        String classifier = "?*+{n}{n,m}{n,}{0,n}";
        //url
        String urlMatlap = "https://regexper.com/";

        //分组使量词的作用域不同
        String input0 = "abcc";
        String input1 = "abcabc";
        String regex0 = "abc{2}";
        String regex1 = "(abc){2}";

        Pattern pattern0 = Pattern.compile(regex0);
        Matcher matcher0 = pattern0.matcher(input0);

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(input1);

        if (matcher0.find()) {
            System.out.println("start : " + matcher0.start() + " end : " + matcher0.end());
        }
        if (matcher1.find()) {
            System.out.println("start : " + matcher1.start() + " end : " + matcher1.end());
        }
    }
}
