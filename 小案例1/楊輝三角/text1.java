package 楊輝三角;

public class text1 {

	public static void main(String[] args) {
		int l=4;
		int[][]a = new int[10][10];
		a[0][0]=1;
			for(int i=1;i<10;i++) {
				for(int k=10-i;k>0;k--) {
					for(int q=0;q<l/2;q++) {
					System.out.print(" ");}
				}
				for(int j=1;j<=i;j++) {
					
					a[i][j]=a[i-1][j]+a[i-1][j-1];
					System.out.printf("%-4d",a[i][j]);
				}
				System.out.println();
			}
			
			
	}

}
