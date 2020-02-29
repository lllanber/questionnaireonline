package top.huafeng.springboot.questionnaireoline.Utils;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Md5_Utils{
    public static String getMD5Value(String str){
        //定义一个加密字节数组
        byte[] secretBytes = null;
        try {
            //创建运算是md5算法的数字摘要对象
            MessageDigest md5 = MessageDigest.getInstance("md5");
            /*
             * 计算摘要:
             * 这里计算的摘要，并不是最终结果，这只是计算后的数值。
             * 这些数值中是带有正负的十进制，并且这些负数需要与256进行加法运算得到一个正值,
             * 而且里的结果有的也是不满32位的，所以到下面还要进行填充0。
             */
            secretBytes  =  md5.digest(str.getBytes());
        } catch (Exception e) {
            new Exception("没有MD5这个算法。").printStackTrace();
        }
//        for (int i = 0; i < secretBytes.length; i++) {
//            System.out.println(secretBytes[i]);
//        }
        //加密数组中的负数与256进行加法运算得到一个正值，并且整个数组转化为16进制
        String value = new BigInteger(1, secretBytes).toString(16);
        //md5性质:如果计算后不足32位前面补0
        for (int i = 0; i < 32 - value.length(); i++) {
            value = "0" + value;
        }
        return value;
    }
}
