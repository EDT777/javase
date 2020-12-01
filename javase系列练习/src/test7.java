public class test7 {
    //5、有一个字符串String str1 =“tip：保存代码是优秀习惯”; 现需求如下：
    //(1)请求出str1中索引为2的字符 和 字符 ’p’ 所在索引的位置。
    //(2)现有另一字符串String str2 =“tip：升班考试”; 比较str1 与str2 内容是否相同
    //(3)请把str1中的“优秀”截取出来。
    //(4)请将str1中的小写转换成大写字母并求出其长度。
    public static void main(String[] args) {
        String str1 ="tip：保存代码是优秀习惯";
        char c =str1.charAt(2);
        System.out.println(c);
        int index =str1.indexOf('p');
        System.out.println(index);
        String str2="tip：升班考试";
        System.out.println(str1.equals(str2));
        int index1 =str1.indexOf('优');
        String sss =str1.substring(index1,index1+2);
        System.out.println(sss);
        String sss2 = str1.toUpperCase();
        System.out.println(sss2);
        System.out.println(sss2.length());
    }
}
