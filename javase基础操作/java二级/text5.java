package java二级;

public class text5{
	   //*********Found**********
	   public static void main(String args[]){
	      String string="现在学习如何访问一个字符串";
	      System.out.println("字符串 \""+string+"\"");
	      //*********Found**********
	      System.out.println("字符串长度："+string.length());//考
	      //*********Found**********
	      System.out.println("其中第7个字符是："+string.charAt(6));//考
	      char sub[] = new char[20];
	      System.out.print("从字节数组的第7到12获取字符是：");
	      string.getChars(6,12,sub,0);
	      System.out.println(sub);
	   }
	}

