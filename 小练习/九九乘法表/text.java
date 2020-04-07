package 九九乘法表;

public class text {

	public static void main(String[] args) {
		
		System.out.println("九九乘法表");
		for(int i=0;i<=9;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		
	}

}
