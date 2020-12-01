package 第一阶段.day_06;

/**
 * 已知数组 int[] arr = {1 ,2,1,1,2,3,4,4,5},
 * (6)int getElementCount(int[]arr ,int value),该方法返回value,在arr数组中出现的次数
 * (7)在主方法中,输出每个元素出现的次数:
 * 例如:	1 在数组中出现了 3 次
 *         2 在数组中出现了 2 次
 * ......
 */
public class test4 {
    public static void main(String[] args) {
        int[] arr = {1 ,2,1,1,2,3,4,4,5};
        System.out.println(getElementCount(arr,2));
        getElementCount(arr);
    }
    public static int getElementCount(int[]arr ,int value){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==value){
                count++;
            }
        }
        return  count;
    }
    public static void getElementCount(int[]arr){
        int count0=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        int count8=0;
        int count9=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
            if(arr[i]==2){
                count2++;
            }if(arr[i]==3){
                count3++;
            }
            if(arr[i]==4){
                count4++;
            }
            if(arr[i]==5){
                count5++;
            }if(arr[i]==6){
                count6++;
            }if(arr[i]==7){
                count7++;
            }if(arr[i]==8){
                count8++;
            }if(arr[i]==9){
                count9++;
            }
        }
        System.out.println("0在数组中出现了"+count0+"次");
        System.out.println("1在数组中出现了"+count1+"次");
        System.out.println("2在数组中出现了"+count2+"次");
        System.out.println("3在数组中出现了"+count3+"次");
        System.out.println("4在数组中出现了"+count4+"次");
        System.out.println("5在数组中出现了"+count5+"次");
        System.out.println("6在数组中出现了"+count6+"次");
        System.out.println("7在数组中出现了"+count7+"次");
        System.out.println("8在数组中出现了"+count8+"次");
        System.out.println("9在数组中出现了"+count9+"次");
    }
}
