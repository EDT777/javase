package 第四阶段.IO.day01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//需求：演示字符文件输入流(FileReader)-输入操作
public class test6 {
    public static void main(String[] args) throws IOException {
        FileReader fr =new FileReader("AKA/a/a.txt");
        char[] c =new char[3];
        int len=0;
        while ((len =fr.read(c))!=-1){
            System.out.println(new String(c,0,len));
        }
        fr.close();
    }
}
