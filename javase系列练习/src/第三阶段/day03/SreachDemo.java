package 第三阶段.day03;
//需求：字符数组char[] arr={‘A’,‘1’,‘R’,‘!’,‘e’,‘&’,‘A’,‘5’,‘A’,‘g’,‘#’,‘D’}，请使用循环，统计出其中英文字母‘A’的个数。
public class SreachDemo {
    public static void main(String[] args) {
        int count=0;
        char[] arr={'A','1','R','!','e','&','A','5','A','g','#','D'};
        for (char c : arr){
            if (c=='A'){
                count++;
            }
        }
        System.out.println("出现A个数为:"+count);
    }
}
