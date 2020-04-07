package 出生多久;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class text {
public static void main(String[] args) throws ParseException {
	Scanner scn = new Scanner(System.in);
	System.out.println("请输入你的生日(格式yyyy-MM-dd):");
	String birthdayStr = scn.nextLine();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date birthday =sdf.parse(birthdayStr);
	Date now =new Date();
	long time =(now.getTime()-birthday.getTime())/3600/1000;
	System.out.println("你已经出生了"+time+"小时");
}
}