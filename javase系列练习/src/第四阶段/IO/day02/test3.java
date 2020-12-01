package 第四阶段.IO.day02;

import java.io.FileReader;
import java.io.FileWriter;

//需求：文件字符流完成拷贝操作
public class test3 {
    public static void main(String[] args) {
        try(FileReader fr =new FileReader("AKA/B/a.txt");
            FileWriter fw =new FileWriter("AKA/B/a_copy2.txt");
        )
        {
            char[] cs =new char[1024];
            int len=0;
            while((len=fr.read(cs))!=-1){
                fw.write(cs,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
