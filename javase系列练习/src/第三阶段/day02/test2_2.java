package 第三阶段.day02;

public class test2_2 {
    public static void main(String[] args) {
            guifan p =new Print();
            p.printLowercaseLetter("ABCDEF");
            p.printUppercaseLetter("asdasd");
    }
}

interface guifan {
    void printLowercaseLetter(String s);

    void printUppercaseLetter(String s);
}

class Print implements guifan {



    @Override
    public void printLowercaseLetter(String s) {
        System.out.println(s.toLowerCase());
    }

    @Override
    public void printUppercaseLetter(String s) {
        System.out.println(s.toUpperCase());
    }
}