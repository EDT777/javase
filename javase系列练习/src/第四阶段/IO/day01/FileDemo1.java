package 第四阶段.IO.day01;

import java.io.File;

//需求：演示File类分隔符
//
//作业目的：了解File类中的字段，最终使用”/”
//
//
//
//需求：演示File类中方法-获取File路径和检测状态
//
//作业目的：熟悉File类中的获取File路径和检测状态方法
//
//
//
//需求：演示File类中的文件操作方法
//
//作业目的：熟悉File类中的文件操作方法
public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("AKA/a/hello.txt");

       file.mkdirs();
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.exists());

    }
}
