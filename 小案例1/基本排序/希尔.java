package 基本排序;

import java.lang.reflect.Array;
import java.util.Arrays;

//插入排序O(o^2)  最好情况(输入的数组完全有序) O(n)
/* 
 *数据集合分割成若干个小组
 *对每一个小组分别进行插入排序，使得整个数组变得基本有序
 *继续划分分组 一直划分到小组内只有一个元素为止 
 */
public class 希尔 {
	
	public static void xier(int array[]) {
		//gap增量初始n/2,每次变为原来的1/2,一直到gap变为1为止
		//增量序列为[n/2,n/4....]
		int current,preindex;
		
		for(int gap=array.length/2;gap>0;gap/=2) {
			
			for(int i=gap;i<array.length;i++) {//gap多少就分多少个小组
				current =array[i];
				preindex =i-gap;
				while(preindex>=0&&array[preindex]>current) {
					array[preindex+gap]=array[preindex];
					preindex-=gap;
				}
				array[preindex+gap]=current; 
			}
		}
		
		System.out.println("希尔排序为:"+Arrays.toString(array));
	}
		public static void main(String[] args) {
			suiji s =new suiji();
			int[] a =s.suiji(10, 6);
			xier(a);
			
		}
		
}
