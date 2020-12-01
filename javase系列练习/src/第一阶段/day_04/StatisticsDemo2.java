package 第一阶段.day_04;

public class StatisticsDemo2 {
    public static void main(String[] args) {
        int count = 0;
        int[][] aka = new int[][]{{1,2,0,4,0},{0,3,5}};
        for (int[] a:aka){
            for (int b :a){
                if (b==0){
                    count++;
                }
            }
        }
        System.out.println("数组元素值为0的有"+count+"个");
    }
}
