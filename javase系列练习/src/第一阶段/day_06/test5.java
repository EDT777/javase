package 第一阶段.day_06;

public class test5 {
    public static int count =0;
    public static void main(String[] args) {
        System.out.println("共循环了"+aka(10)+"次");
    }

    public static int aka(int a){
        if(a==1){
          return count;
        }
        if(a%2!=0){
            a=a*3+1;
            count++;
            aka(a);
        }else {
            a=a/2;
            count++;
            aka(a);
        }
        return count;
    }
}
