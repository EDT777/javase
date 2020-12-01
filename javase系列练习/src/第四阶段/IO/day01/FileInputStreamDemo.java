package 第四阶段.IO.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

//需求：使用文件字节输入流进行输入操作
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("AKA/a/a.txt");
        byte[] bs= new byte[3];
        int len=0;
        int aka =fis.read();
        System.out.println((char)(aka));
        while (len!=-1){
            len=fis.read(bs);
            System.out.println(Arrays.toString(bs));
        }
        fis.close();

    }
}
