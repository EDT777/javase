package 第一阶段.day_04;

public class LocationDemo {
    public static void main(String[] args) {
        int sum=0;
        int a[] =new int[]{2,4,9,1,2,3};
        for (int i=0;i<a.length-1;i++){
            if(i%2==0){
                sum+=a[i];
            }
        }
        System.out.println("索引是偶数之和为:"+sum);
    }
}
