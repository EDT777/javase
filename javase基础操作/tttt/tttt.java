package tttt;


public class tttt {
	public static void main(String[] args) {
		String[][] a = new String[10][10];
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				a[i][j]="*";
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
