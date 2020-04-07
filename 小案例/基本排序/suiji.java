package 基本排序;

import java.util.Arrays;

public class suiji {
	
	
	public static int[] suiji(int n,int max) {
		int[] nums =new int[n];
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			temp+=1+(Math.random()*n/max);//这个数不会重复
			nums[i]=temp;
		}
		//乱序
		for(int i=0;i<nums.length;i++) {
			int index =(int)(Math.random()*nums.length);
			//交换
			 temp=nums[i];
			 nums[i]=nums[index];
			 nums[index]=temp;
		}
		
		return nums;
	}
		public static void main(String[] args) {
				int[] a =suiji(10,500);
				System.out.println("随机产生数组为:"+Arrays.toString(a));
		}
		
		
}
