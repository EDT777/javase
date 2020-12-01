package 第一阶段.day_02;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        //判断一个数99是不是偶数，并打印结果
        int a = 99;
        int b = 20;
        if (a % 2 == 0) {
            System.out.println(a + "此数是偶数");
        } else {
            System.out.println(a + "此数不是偶数");
        }

        //（2）求出99和20之间的最大的一个值，并打印结果

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
//（3）一共有55条数据,每页显示10条数据,请问一共分多少页
      final int DATA =55;
        int aa = 55%10;
        if(aa!=0){
            System.out.println("需要"+((DATA/10)+1)+"页");
        }else{
            System.out.println("需要"+(DATA/10)+"页");
        }

    }

}
