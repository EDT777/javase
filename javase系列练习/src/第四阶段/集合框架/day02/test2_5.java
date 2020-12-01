package 第四阶段.集合框架.day02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//已知java学院教课内容安排如下
//
//老师    课程
//
//stef	   p2p
//
//will    javaWeb
//
//neld    springmvc
//
//hesj    wms
//
//bunny   javaWeb
//
//hhaiy   javaSe
//
//要求：
//
//1：使用Map， 以老师名字为key 课程名为value， 完成课程安排
//
//2：添加一个新老师 dafei 教jdbc
//
//3：hhaiy 改为教javaWeb
//
//4：输出所有老师，以及老师教授课程
//
//5：查出所有教javaWeb的老师
//
//
public class test2_5 {
    public static void main(String[] args) {
        Map<String,Object> map =new HashMap<>();
        map.put("stef","p2p");
        map.put("will","javaWeb");
        map.put("neld","springmvc");
        map.put("hesj","wms");
        map.put("bunny","javaWeb");
        map.put("hhaiy","javaSe");
        map.put("dafei","jdbc");
        map.put("hhaiy","javaWeb");
        Set<Map.Entry<String,Object>> sets =map.entrySet();
        for (Map.Entry e:sets){
            System.out.println(e.getKey()+" 教 "+e.getValue());
        }
    }
}
