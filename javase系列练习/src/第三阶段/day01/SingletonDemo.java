package 第三阶段.day01;

import java.util.Arrays;

public class SingletonDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = danli.getDanli().aka(a);
        System.out.println(Arrays.toString(b));
    }
}

class danli {

    private static danli d = new danli();

    private danli() {

    }

    static danli getDanli() {
        return d;
    }

    public int[] aka(int[] a) {
        a[0] = 123;
        return a;
    }

}