package 第三阶段.day02;
//需求：
//
//- 判断一个字符串是否全部有数字组成
//
//- 判断一个字符串是否是手机号码
//
//- 判断一个字符串是否是18位身份证号码
//
//- 判断一个字符串是否6到16位，且第一个字必须为字母
//
//
public class test8 {
    public static void main(String[] args) {
        String reg="\\d*"; //表示数字
        System.out.println("12345".matches(reg));
        System.out.println("as12".matches(reg));
        System.out.println("====");
        String reg2 ="1[379][0-9]{9}";
        System.out.println("17666407017".matches(reg2));
        System.out.println("12455533455".matches(reg2));
        System.out.println("======");
        String reg3 = "\\d{17}[[0-9]X]";
        System.out.println("44078519980220001X".matches(reg3));
        System.out.println("==========");
        String reg4="[a-zA-Z]\\w{5,15}";
        System.out.println("aqwe536".matches(reg4));
    }
}
