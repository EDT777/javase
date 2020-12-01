import java.text.SimpleDateFormat;
import java.util.Date;

public class test8 {
    //(1)使用单例模式设计DateUtil工具类
    //(2)在工具方法format中, 将指定的日期对象转换成”xxxx年xx月xx日 xx时xx分
    //xx秒” 格式的字符串并返回.
    public static void main(String[] args) {
            Date d =new Date();
            DateUtil dd =DateUtil.getInstance();
            dd.format(d);
    }
}
class DateUtil{
    private static DateUtil du =new DateUtil();
    private DateUtil(){

    }
    static DateUtil getInstance(){
        return du;
    }
    public void format(Date d){
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
        String s = sdf.format(d);
        System.out.println(s);
    }
}