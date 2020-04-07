package 基本排序;

import java.util.Arrays;

public class 冒泡 {
	public static void main(String[] args) {
		
		int a[]= {1,9,5,6,7,2,4};
		maopao(a);
	
		
	}
	
	public static void maopao(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
