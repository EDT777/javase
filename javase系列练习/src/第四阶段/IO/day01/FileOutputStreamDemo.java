package 第四阶段.IO.day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//需求：使用文件字节输出流进行输出操作
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo =new FileOutputStream(new File("AKA/a/a.txt"),true);
        fo.write(97);
        fo.write("哈哈哈a".getBytes());
        fo.close();
    }
}
