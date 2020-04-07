import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class aaa {
	

	public static void main(String[] args) {
		hannuo(4,"A","B","C");
		
		
	}
	
	public static void hannuo(int num,String start,String mid,String end) {
		
		if(num==1) {
			System.out.println(num+"盘从"+start+"移动到"+end);
		}else {
			hannuo(num-1,start,end,mid);
			System.out.println(num+"盘从"+start+"移动到"+end);
			hannuo(num-1,mid,start,end);
		}
	}
	
	
	
	}