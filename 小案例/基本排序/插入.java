package 基本排序;

import java.util.Arrays;

public class 插入 {
	public static void main(String[] args) {
		int a[]= {10,1,9,5,6,7,2,0};
		cha(a);

	}

	public static void cha(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			// 找当前第i个元素应该访到i前面的元素的位置，要找到第一个比当前元素小的元素
			int index = 0;
			int target = nums[i];// 要插入的元素
			// 循环找第一个比nums[i]还小的元素
			for (int j = i - 1; j >= 0; j--) {
				if (nums[j] < target) {
					index = j + 1;
					break;
				}
			}
			// 插入元素
			// 移动从index开始直到i的位置的所有元素
			for (int j = i; j > index; j--) {
				nums[j] = nums[j - 1];
			}
			nums[index] = target;
		}
		System.out.println("插入排序："+Arrays.toString(nums));
	}
}
