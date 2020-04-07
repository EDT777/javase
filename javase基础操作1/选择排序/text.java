package 选择排序;

public class text {
//找出最小值，然后和最前面的数据交换
	public static void main(String[] args) {
		int[]a= {4,1,5,9,6};
		for(int i=0;i<a.length-1;i++) {
			//假设第一个数是最小值，记录最小值元素下标
			int min=i;
		
			for(int j=i+1;j<a.length;j++) {
			
				if(a[min]>a[j]) {
					//给min重新赋值
					min=j;
				}
			}//考虑交换位置
		if(min!=i) {
			int temp =a[i];
			a[i]=a[min];
			a[min]=temp;
		}
				
	}//输出
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
