package 二分法;
//查找建立在已排序的基础上，没有重复元素
public class text {

	public static void main(String[] args) {
		int[]a={1,4,6,7,8,35};
		int destelement=35;
		//从数组中查找这10个元素的下标
		int index=binarysearch(a,destelement);//如果找到就返回元素下标，找不到就返回-1
		System.out.println((index==-1)?destelement+"元素不存在":destelement+"下标为"+index);
		
		
	}
	public static int binarysearch(int []a,int destelement) {
		int begin=0;
		int end=a.length-1;
		
		while(begin<=end) {
			int mid =(begin+end)/2;
			if(a[mid]==destelement) {
				return mid;
			}
			else if(a[mid]>destelement) {
				end=mid-1;
			}
			else if(a[mid]<destelement) {
				begin=mid+1;
			}
		}
		return -1;
	}

}
