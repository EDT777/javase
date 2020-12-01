package 第四阶段.IO.day02;

import java.io.*;

//需求：演示字节缓冲流(BufferedInputStream-BufferedOutputStream)-输入操作和输出操作
public class test4 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("AKA/B/a.txt"));
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("AKA/B/a_copy3.txt"));
        byte[] bs =new byte[1024];
        int len=0;
        while((len=bis.read(bs))!=-1){
            bos.write(bs,0,len);
        }
        bis.close();
        bos.close();

    }
}
