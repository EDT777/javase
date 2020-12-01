import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test3 {
    //(1)创建日期对象
    //(2)将时间对象转化成”xxxx年xx月xx日 xx时xx分xx秒”格式的字符串输出在控制台
    //(3)将转换后的字符串通过IO流保存到当前项目中的 time.txt文件中.
    public static void main(String[] args) throws IOException {
        Date d =new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年 MM月 dd日 HH时mm分ss秒");
        String date=sdf.format(d);
        System.out.println(date);
        FileWriter fw =new FileWriter("AKA/time.txt");
        fw.write(date);
        fw.flush();
        fw.close();
    }
}
