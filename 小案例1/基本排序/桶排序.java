package 基本排序;

import java.util.Arrays;

public class 桶排序 {

	public static void tong(int[] array, int min, int max) {
		// 为min到max之间的每个数都准备一个桶
		int[] buckets = new int[max - min + 1];

		// 把数组的数据放到桶里
		for (int i : array) {
			int bucketNo = i - min;

			buckets[bucketNo]++;
		}

		// 依次从桶里取出数据
		int index = 0;
		for (int i = 0; i < buckets.length; i++) {
			// 跳过没有数据的桶
			if (buckets[i] == 0)
				continue;

			// 根据下标算出桶里的数据
			int num = i + min;

			for (int j = 0; j < buckets[i]; j++) {
				array[index++] = num;
			}
		}

	}

	public static void main(String[] args) {
		suiji s = new suiji();
		int[] arr = suiji.suiji(10, 5);
		int min = arr[0], max = arr[0];
		for (int i : arr) {
			min = Math.min(i, min);
			max = Math.max(i, max);
		}

		tong(arr, min, max);

		System.out.println("Before:" + Arrays.toString(arr));
	}
}
