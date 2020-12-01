package 第一阶段.day_04;

public class ReversedDemo {
    public static void main(String[] args) {
        String[] str = new String[]{"A","B","C","D"};
        String s="[";
        for (int i=str.length-1;i>=0;i--){
            s+=str[i];
            if (i==0){
                s+="]";
            }else {
                s+=",";
            }
        }
        System.out.println(s);
    }
}
