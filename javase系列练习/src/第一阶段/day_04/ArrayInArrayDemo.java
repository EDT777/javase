package 第一阶段.day_04;

/**
 * 需求：演示二维数组的基本操作
 *
 * 步骤：
 *
 * （1）定义一个二维数组
 *
 * （2）静态初始化二维数组
 *
 * （3）动态初始化二维数组
 *
 * （4）获取二维数组的元素
 *
 * （5）设置二维数组的元素
 *
 * （6）for循环遍历并打印二维数组的元素
 *
 * （7）foreach循环遍历并打印二维数组的元素
 */
public class ArrayInArrayDemo {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int[][] b = new int[][]{{1,2,3},{3,1,2}};
        int c = b[0][0];
        b[1][1]=2;
        System.out.println(c);
        System.out.println(b[1][1]);
        //（6）for循环遍历并打印二维数组的元素
        System.out.println("begin.......");
        for (int i =0;i<=b.length-1;i++){
            for (int j=0;j<=b[i].length-1;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        System.out.println("end.........");
        System.out.println("begin.......");
        //（7）foreach循环遍历并打印二维数组的元素

           for (int[] aka:b){
               for (int bkb:aka){
                   System.out.print(bkb);
               }
               System.out.println();
           }

        System.out.println("end.........");
    }
}
