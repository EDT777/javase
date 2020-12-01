import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
//1、已知数组 String[] arr = {“1”,”1”,”1”,”2”,”2”,”3”,”3”,”4”};
//(1)将数组的数据添加到合适的集合中,并去除重复数据.
//(2)遍历集合中的数据,将字符串转化成int数据,进行累加求和输出结果

public class test {
    public static void main(String[] args) {
        int sum=0;
      String[] arr ={"1","1","1","2","2","3","3","4"};
        List list =new ArrayList();
        for (int i=0;i<arr.length;i++){
            if (!(list.contains(arr[i]))){
                list.add(arr[i]);
            }
        }
        System.out.println(list);

        Iterator it =list.iterator();
        while (it.hasNext()){
            int count = Integer.valueOf(String.valueOf(it.next()));
            sum+=count;
        }
        System.out.println(sum);
    }


}
