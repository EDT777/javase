package 第三阶段.day02;
//String[] strs = {"2+3+4","2+4","5+6","9+7"};
//
//1）请把strs中的所有数字加起来；
//
//2）请求出所有数字的平均数
//
// 注意： + 正则表达式中的特殊字符
public class test2_4 {
    public static void main(String[] args) {
        double sum = 0;
        String[] strs ={"2+3+4","2+4","5+6","9+7"};
        for (String s:strs){
            String[] s2 =s.split("\\+");
            for (String s3 : s2){
                int i =Integer.parseInt(s3);
                sum+=i;
            }
        }
        System.out.println(sum);
        System.out.println(sum/(strs.length));
    }
}
