package 第一阶段.day_03;

public class LoopControlDemo {
    public static void main(String[] args) {
        //需求1：从1输出到10，当迭代变量为7，就停止循环
        System.out.print("begin->   ");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;//结束当前循环 }
            }
            System.out.print("第" + i);
        }
        System.out.println("  ->end");
        //需求3：从1输出到10，不要输出4
        System.out.println("begin->    ");
        for (int k=1;k<=10;k++){
            if(k==4){
                continue;
            }
            System.out.println("输出:"+k);
        }
        System.out.println("   ->end");
        //需求2：从1输出到10，当迭代变量为7，就终止程序
        System.out.print("begin->    ");
        for (int j = 1; j <= 10; j++) {
            if (j == 7) {
                return;
            }
            System.out.print("第" + j);
        }
        System.out.print("    ->end");
    }
}


