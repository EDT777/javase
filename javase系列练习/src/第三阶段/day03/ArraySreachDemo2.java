package 第三阶段.day03;

//需求：定义一个方法，进行数组二分查找，并调用Arrays中的二分查找方法
public class ArraySreachDemo2 {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 534, 23, 123, 53, 232, 1232};
        System.out.println(aka(a, 53));
    }


    public static int aka(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            int midValue = a[mid];
            if (midValue < key) {
                low = mid + 1;
            } else if (midValue > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
