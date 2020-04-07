package java二级;
//要求b输出5
public class text4{
	   public static void main(String args[]) {
	      byte b = 10;   // 二进制表示00001010 
	      byte c = 0X000f;//考
	      b = (byte)(b ^ c);//考
	      System.out.println("b的结果是："+ b);//考
	   }
	}