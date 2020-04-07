package 排序;
import java.util.*;
public class 插入排序 {
			public static void main(String[] args) {
				int[] nums= {12,7,6,9,5};
			for(int i=1;i<nums.length;i++) {
				//找出当前第i个元素应该访到i前面的元素的位置
				int index=0;
				int target=nums[i];//要插入的元素
				//循环找到第一个比nums[i]还小的元素
				for(int j=i-1;j>=0;j--) {
					if(nums[j]<target) {
						index = j+1;
						break;
					}
				}
				//插入元素
				//移动从index开始直到i的位置的所有元素
				for(int j=i;j>index;j--) {
					nums[j] =nums[j-1];
				}
				nums[index]=target;
				
			}
			System.out.println(Arrays.toString(nums));
			
			}
}
