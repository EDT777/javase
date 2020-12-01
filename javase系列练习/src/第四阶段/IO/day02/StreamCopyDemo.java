package 第四阶段.IO.day02;

import java.io.*;

//需求：使用文件字节流进行文件拷贝
public class StreamCopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fr =new FileInputStream("AKA/B/a.txt");
        FileOutputStream fw =new FileOutputStream("AKA/B/a_copy.txt");
       byte [] cs =new byte[1024];
        int len=0;
        while ((len=fr.read(cs))!=-1){
            fw.write(cs,0,len);
        }
        fr.close();
        fw.close();
    }
}
