package java二级;
//目的让数字 逆着输出
public class text7{
    public static void main(String[] args) {
        int a,x = 2008;
        //*********Found**********
        System.out.print(  x +"->" );
        while( x != 0 ){
            //*********Found**********
            a = x%10;//考
            System.out.print(a);
            //*********Found**********
            x =x/10;//考
        }
    }
}