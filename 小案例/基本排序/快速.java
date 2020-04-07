package 基本排序;

import java.util.Arrays;

public class 快速 {
	//实现数组的从第left个元素到第right个元素的排序
	public static void kuaipai(int[] nums,int left,int right) {
		if(left>=right) {
			//只有一个或者0个元素，无需再排序
			return;
		}
		
		int st =nums[left];//参考值
		int i=left; 
 		int j=right;
		while(i<j) {
			//从右边找到任何一个比st小的值挪到i所在的位置
			while(i<j&&nums[j]>=st) {
				j--;
			}
			if(i<j) {
					nums[i]=nums[j];
					i++;//	i这个位置的元素一定比st小所以不需再比较
			}
			//从左边找比st大的数
			while(i<j&&nums[i]<=st) {
				i++;
			}
			
			if(i<j) {
				nums[j]=nums[i];
				j--;
			}
			nums[i]=st;
			
		}
		//再次缩小范围调用当前排序
		kuaipai(nums,left,i-1);
		kuaipai(nums,i+1,right);
	}
			
	public static void main(String[] args) {
		
		int a[]= {1,21,3,22,7,3,8};
		kuaipai(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	
	
}
