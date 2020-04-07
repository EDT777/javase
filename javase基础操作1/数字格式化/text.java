package 数字格式化;
//数字格式化元素：
// # 任意数字
// , 千分位
// . 小数点
// 0 不够补0
import java.text.DecimalFormat;
public class text {

	public static void main(String[] args) {
		//创建数字格式化对象
		//需求：加入千分位
		DecimalFormat d = new DecimalFormat("###,###");
		//开始格式化
		//Number-->String
		System.out.println(d.format(1234567));
		
		//需求：加入千分位，保留两位小数
		DecimalFormat d2 = new DecimalFormat("###,##.##");
		System.out.println(d2.format(1234.567));
		
		//需求：加入千分位，保留4位小数，不够补0
		DecimalFormat d3 = new DecimalFormat("###,##.0000");
		System.out.println(d3.format(14.5));
	}

}
