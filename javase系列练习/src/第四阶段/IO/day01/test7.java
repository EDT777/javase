package 第四阶段.IO.day01;

import java.io.FileWriter;
import java.io.IOException;

//需求：演示字符文件输出流(FileWriter)-输出操作
public class test7 {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("AKA/a/a.txt",true);
        fw.write('啊');
        fw.write("呵ssss".toCharArray());
        fw.flush();
        fw.close();
    }
}
