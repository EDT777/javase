package 获取时间;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class text {
//获取系统当前时间
	public static void main(String[] args) throws ParseException {
			Date nowtime =new Date();
			System.out.println(nowtime);
			
			//创建格式化对象
			SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
			//开始格式化
			String ss =s.format(nowtime);
			System.out.println(ss);
			//将字符串转化成日期类型
			String strtime = "1998年02月20日 07:07:07 777";
			Date D = s.parse(strtime);
			System.out.println(D);
	}

}
