package java二级;

public class text6 {
    public static void main(String[] args) {
        //*********Found**********
        for (int i=1;i<=5;i++){//考
            for(int k=1;k<=5-i;k++)
                //*********Found**********
                System.out.print(" ");
            //*********Found**********
            for(int j=1;j<=2*i-1;j++)//考
                System.out.print("*");
            //*********Found**********
            System.out.println();
        }
    }
}