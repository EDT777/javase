package 第三阶段.day01;

public class EqualsDemo {
    public static void main(String[] args) {
        String s =new String("a");
        String s2=new String("a");
        String s3 ="a";
        System.out.println(s==s2);
        System.out.println(s==s3);
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));
        System.out.println(!"".equals(s)&& s!=null);
    }
}
