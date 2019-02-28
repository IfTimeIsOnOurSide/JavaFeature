package day5_serialization;

import java.io.*;

/**
 * @Description: 序列化  Java具有可以执行的原因所在
 * @author: daimin
 * @date: Create in 14:24 2019/2/28
 */
public class serializationDemo {
    public static void main(String[] args) {
//        toSerialization();

        returnObject();
    }

    /**
    * 序列化 FileOutputStream (ObjectOutputStream)
     */
    public static void toSerialization () {
        serialization obj = new serialization("nanxi", "蓝猫", "grey", 2);

        try {
            FileOutputStream outputStream = new FileOutputStream(new File("serialization.ser"));
            ObjectOutputStream objOutputStream = new ObjectOutputStream(outputStream);
            objOutputStream.writeObject(obj);

            //关闭
            outputStream.close();
            objOutputStream.close();
            System.out.println("The Object named serialization have be serialized into serialization.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
    * 反序列化 FileInputStream (ObjectInputStream)
     */
    public static void returnObject () {
        serialization obj = null;

        try {
            File file = new File(System.getProperty("user.dir") + "/java/day5_serialization/file/serialization.ser");
            FileInputStream inputStream = new FileInputStream(file);
            ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
            obj = (serialization) objInputStream.readObject();

            inputStream.close();
            objInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
            return;
        }

        //反序列结果
        obj.getName();
//        obj.getType();
//        obj.getColor();
//        obj.getAge();
    }
}
