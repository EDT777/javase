package 计算出生多久;
import java.util.*;
import java.text.*;
public class text {
	public static void main(String[] args) throws ParseException {
			Scanner s = new Scanner(System.in);
			System.out.println("请输入您的生日(格式为yyyy-MM-dd)");
			String birthdayStr = s.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthday = sdf.parse(birthdayStr);
			Date now=new Date();
			long time=(now.getTime()-birthday.getDate())/3600/1000;
			System.out.println("你已经出生"+time+"小时");
	}
}
