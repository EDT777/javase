package 第四阶段.IO.day01;
//需求：File类案例-使用递归列出指定目录中所有的子文件
import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File f =new File("AKA/a");
        File[] fs =f.listFiles();
        for (File f2:fs){
            System.out.println(f2.getName());
        }
    }
}
