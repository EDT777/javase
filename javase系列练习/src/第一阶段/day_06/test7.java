package 第一阶段.day_06;
//求出1 + 2！+ 3！+ 4！+...+20！的结果
public class test7 {
    public static void main(String[] args) {
        int aka=0;
        for (int i=1;i<=20;i++){
            aka += sum(i);
        }
        System.out.println("总和为:"+aka);
    }
    public static int sum(int a){
        int sum=1;
        for (int i=1;i<=a;i++){
            sum = sum*i;
        }
        return sum;
    }
}
