package 第三阶段.day01;

public class tringDemo {
    public static void main(String[] args) {
        String s ="abcdef";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("a"));
        System.out.println(s.equals("abcdef"));
        System.out.println(s.equalsIgnoreCase("ABCDEF"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(1,3));
        System.out.println(s.substring(1));
        System.out.println(s.endsWith("ef"));
        System.out.println(s.startsWith("a"));
        System.out.println(s.replace("a","b"));

    }
}
