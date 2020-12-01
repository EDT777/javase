package 第三阶段.day03;
//需求：请输出1-100以内最大的五个质数(质数又称素数。一个大于1的自然数，如果除了1和它自身外，不能被其他自然数整除的数)。
public class PrimeNumbeDemo {
    public static void main(String[] args) {
        System.out.println("1-100之间的质数有:");
        for (int i=2;i<=100;i++){
            for (int j=2;j<i;j++){
                    if(i%j!=0 && i%2!=0){
                        System.out.print(i+" ");
                        break;
                    }
            }
        }

    }
}
