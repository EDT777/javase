package 基本排序;

import java.util.Arrays;

public class 改进冒泡 {
	
	
	
	public static void main(String[] args) {
		suiji s = new suiji();
		int a[]= s.suiji(10, 3);
		gaijinmaopao(a);
	}
	
	
	public static void gaijinmaopao(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int index=0;
			for(int j=0;j<nums.length-i;j++) {
				if(nums[j]>nums[index]) {
					index=j;
				}
			}
			int temp=nums[index];
			nums[index]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		
		System.out.println("改进版冒泡排序为："+Arrays.toString(nums));
	}
}
