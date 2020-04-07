package 排序;


public class 快排 {

	public static void main(String[] args) {
		int[] arr={6,3,7,9,5,1,4,8};
		quickSort(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
	
	}
	public static void quickSort(int arr[],int left,int right) {
		//进行判断，如果左索引比右索引大
		if(left==right) {
			System.out.println("出问题了");
		}
		//定义变量保存基准值
		int base=arr[left];
		//定义i指向左边
		int i=left;
		//定义变量j指向右边
		int j=right;
		//当i和j不相遇时，在循环中进行检索
		while(i!=j) {
			//j从右往左进行检索比基准数小的，如果检索到比基准数小的就会停下
			//如果检索比基准数大的或者相等，就继续检索
			while(arr[j] >= base && j > i) {
				j--;//j从右往左移动
			}
			while(arr[i]<= base && j > i) {
				i++;//i从左往右移动
			}
			//代码到这i和j都停了，然后交换位置
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		//如果上面while循环条件不成立会跳出这个循环，往下执行
		//如果这个条件不成立说明i和j相遇了
		//如果i和j相遇了，就交换基准数这个元素和相遇元素
		//把相遇位置的元素赋值给基准数这个位置
		arr[left]=arr[i];
		//把基准数赋值给相遇位置
		arr[i]=base;
		//基准数归位，左边比它小，右边比它大
		//排基准数左边
		quickSort(arr,left,i-1);
		//排右边
		quickSort(arr,i+1,right);
		
		
	}

}
