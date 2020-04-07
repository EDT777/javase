package 正则表达式;
import java.util.*;
import java.util.regex.Pattern;
public class text {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入身份证");
		String idcard=s.nextLine();
		System.out.print("请输入电话号码");
		String phone=s.nextLine();
		System.out.print("请输入qq");
		String qq=s.nextLine();
		//正则表达式
		String idcardpattern="[1-9]\\d{16}[0-9xX]";
		String phonepattern="1[2-9]\\d{9}";
		String qqpattern="{1-9}\\d{4,12}";
		boolean id =Pattern.matches(idcardpattern, idcard);
		boolean phone1=Pattern.matches(phonepattern, phone);
		boolean qq1=Pattern.matches(qqpattern, qq);
		if(!id) {
			System.out.println("身份证信息不正确");
		}
		 if(!phone1) {
			System.out.println("手机号格式不正确");
		}
		 if(qq1) {
			System.out.println("qq格式不正确");
		}
		 if(id&&phone1&qq1) {
			System.out.println("输入的信息满足要求");
		}
		s.close();
	}
	
		
}
