package 基本排序;

import java.util.Arrays;
//利用完全二叉树特性 空间复杂度：O(n)
public class 归并 {
		public static int[] guibing(int[] array) {
		if(array.length<=1) {
			return array;
		}else {
			int middle =array.length/2;
			int[] left =Arrays.copyOfRange(array, 0, middle);
			int[] right=Arrays.copyOfRange(array, middle, array.length);
			
			return merge(guibing(left),guibing(right));
		}
		}
		
		public static int[] merge(int[] left,int[] right) {
			int[]temp = new int[left.length+right.length];
			
			int index=0,leftIndex=0,rightIndex=0;
			while(leftIndex<left.length&&rightIndex<right.length) {
			//依次将左右2个字序列的元素复制到临时数组中
			if(left[leftIndex]<right[rightIndex]) {
				temp[index++]=left[leftIndex++];
			}else {
				temp[index++]=right[rightIndex++];
			}
			
			}
			
			//将剩余的子序列的元素复制到临时数组中
			while(leftIndex<left.length) {
				temp[index++]=left[leftIndex++];
			}
			
			while(rightIndex<right.length) {
				temp[index++]=right[rightIndex++];
			}
			
			return temp;
		}
		public static void main(String[] args) {
			suiji s = new suiji();
			int[] a =s.suiji(10, 2);
			int[] b=guibing(a);
			System.out.println("归并排序："+Arrays.toString(b));
		}
			
}
