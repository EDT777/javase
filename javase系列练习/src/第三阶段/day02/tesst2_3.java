package 第三阶段.day02;
//设计一个方法 getCpCode(double orderFee,String province) 并且在main方法中调用,打印出getCpCode(80,”北京市”)的返回结果.
//
//根据订单金额 orderFee 和 收货人省份 province来判断使用哪家快递公司,具体需求如下
//
//如果订单金额在128以上并且是广东省的收货地址,直接使用顺丰包邮, 返回 字符串 “SF”,
//
//如果订单金额在58以上,128以下并且是北京市的收货地址,直接使用EMS包邮,返回字符串”EMS”,
//
//其他情况默认为中通快递,返回字符串”ZTO”
public class tesst2_3 {
    public static void main(String[] args) {

        getCpCode(80,"北京市");
    }
    static void getCpCode(double orderFee,String province){
        if(orderFee>128 && province=="广东省"){
            System.out.println("SF");
        }else  if(128>orderFee && orderFee>58 && province=="北京市"){
            System.out.println("EMS");
        }else {
            System.out.println("ZTO");
        }
    }
}

