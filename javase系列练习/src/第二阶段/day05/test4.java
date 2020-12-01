package 第二阶段.day05;
//4、 定义两个类，一个 Person 类，一个 Gun 类。 Gun 里面有一个弹夹(int 类的数组)初始容量为 5，还有一个装子弹的方法 push，打出子弹的方法 pop。Person 类有一个实例方法 shoot 方法，调用 Gun 中 方法 pop，请用代码模拟一个人开枪射击的过程，装填子弹（装满了就不能再装填），射击（没子弹不能射击），先装进的子弹先射击出去。
public class test4 {
    public static void main(String[] args) {
            Aka_Person a =new Aka_Person();
           for (int i =1;i<=6;i++){//将子弹填充满
               Gun.push((i+(int)(Math.random()*100)));
           }
        for (int i =1;i<=6;i++){//将子弹射完
            a.shoot();
        }


    }
}
class Aka_Person{
    String name="小豪";
    void shoot(){
        Gun.pop();
    }
}
class Gun {

    static int[] gunNums = new int[5];

    static void push(int gunNum) {
        if (gunNums[0] != 0 && gunNums[1] != 0 && gunNums[2] != 0 && gunNums[3] != 0 && gunNums[4] != 0) {
            System.out.println("子弹已装满，无需再填充");
        } else {
            for (int i = 0; i <= 4; i++) {
                if (gunNums[i] == 0) {
                    gunNums[i] = gunNum;
                    System.out.println("已填充" + gunNum + "个子弹，放入在第" + (i + 1) + "个子弹槽");
                    break;
                }
            }
        }

    }

    static void pop() {
        if (gunNums[0] == 0 && gunNums[1] == 0 && gunNums[2] == 0 && gunNums[3] == 0 && gunNums[4] == 0) {
            System.out.println("子弹已用光，无法射击，请及时填充子弹");
        } else {
            for (int j = 0; j <= 4; j++) {
                if (gunNums[j] != 0) {
                    System.out.println("射出" + gunNums[j] + "个子弹");
                    gunNums[j] = 0;
                    break;
                }
            }
        }
    }

}