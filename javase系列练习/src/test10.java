public class test10 {
    //9.(逻辑题) 给定一个字符串, 你需要反转字符串中的每个单词的字符顺序, 同时仍保留空格和单词的初始顺序.
    //   如: 传入的字符串为: “Let’s  take  LeetCode  contest”
    //       打印结果为:  “s’teL  ekat  edoCteeL  tsetnoc”
    public static void main(String[] args) {
        String s ="Let’s  take  LeetCode  contest";
        String[] ss =s.split(" ");
        StringBuffer sb =new StringBuffer();
        for (String s1 :ss){
            sb.append(re(s1)+" ");
        }
        System.out.println(sb);
    }
    static String re(String s){
        String bb="";
        for (int i=0;i<s.length();i++){
            bb = s.charAt(i) +bb;
        }
        return bb;
    }
}

