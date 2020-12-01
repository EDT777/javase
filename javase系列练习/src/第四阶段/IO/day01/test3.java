package 第四阶段.IO.day01;

import java.io.UnsupportedEncodingException;

//需求：字符解码和编码操作
public class test3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="哈哈哈哈";
        System.out.println(s);
        byte[] bs =s.getBytes("UTF-8");//编码
        String s2 =new String(bs,"ISO-8859-1");//解码
        System.out.println(s2);
        byte[] bs2 =s2.getBytes("ISO-8859-1");
        String s3 =new String(bs2,"UTF-8");
        System.out.println(s3);
    }
}
