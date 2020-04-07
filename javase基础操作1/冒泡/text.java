package 冒泡;

public class text {
	
	public static void main(String[] args) {
		int []a= {5,2,7,0,4};
		//开始排序
		for(int i=a.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1])
				{//交换位置
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		//遍历
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
}
