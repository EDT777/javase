package 第三阶段.day01;

//实现功能对指定的敏感词汇进行过滤替换，把敏感词过滤成*号输出
//
//如原句：“窝草，昨晚又停电了！”
//
//过滤后为：“**，昨晚又停电了！”
public class FiltrationDemo {
    public static void main(String[] args) {
        String s = new String("窝草，昨晚又停电了！");
        String s2 = s.replace("窝草", "**");
        System.out.println(s2);
    }
}
