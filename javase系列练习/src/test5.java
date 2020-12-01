import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test5 {
    //3、现有数组int[] arr = {1, -1, 1, 3, 2, 3}, 请定义一个获取重复元素的方法getRepeatEle，方法接收int类型数组，实现将重复元素（如有多个重复元素只装一个）装进新数组并返回。
    //提示：上面数组中1和3是重复元素，将其存放到新数组中
    public static void main(String[] args) {
        int[] arr = {1, -1, 1, 3, 2, 3};
       int[] news = getRepeatEle(arr);
        System.out.println(Arrays.toString(news));
    }
    public  static int[] getRepeatEle(int[] a){
        int count=0;
        int[] aka=new int[2];
        List list =new ArrayList();
        for (int i =0;i<a.length;i++){
            if (!(list.contains(a[i]))){
                list.add(a[i]);
            }else {
               aka[count++]= a[i];
            }

        }

        return aka;
    }
}
