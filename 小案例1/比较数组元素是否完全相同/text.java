package 比较数组元素是否完全相同;

public class text {
	  public static boolean equals(long[] a, long[] a2) {
	        if (a==a2)
	            return true;
	        if (a==null || a2==null)
	            return false;

	       int length = a.length;
	        if (a2.length != length)
	            return false;

	        for (int i=0; i<length; i++)
	            if (a[i] != a2[i])
	                return false;

	       return true;
	    }
	  
	  public static void main(String[] args) {
		long[] a = {123,321,1234};
		long[] b = {123,321};
		
		System.out.println(equals(a,b));
	}
}
