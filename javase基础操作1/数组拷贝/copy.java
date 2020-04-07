package 数组拷贝;

public class copy {
public static void main(String[] args) {
	int [] a= {1,2,3,4,5};
	int [] b = {6,7,8,9,99};
	//System.arraycopy(源数组，源数组开始的下标，目标数组，目标数组开始的下标，拷贝长度)
	System.arraycopy(a,2,b,2,2);
	for(int i=0;i<b.length;i++)
	System.out.println(b[i]);

}
}
