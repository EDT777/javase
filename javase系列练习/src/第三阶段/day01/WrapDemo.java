package 第三阶段.day01;
//包装类、基本数据类型、String三者的互换
public class WrapDemo {
    public static void main(String[] args) {
        Integer i =12;
        System.out.println(i);
        int a =i.intValue();
        System.out.println(a);
        String s1=String.valueOf(a);
        int a2 = Integer.parseInt(s1);
        System.out.println(a2);
    }
}
