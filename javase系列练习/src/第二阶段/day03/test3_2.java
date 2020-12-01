package 第二阶段.day03;



/*
现有中国电信(ChinaTelecom),中国移动(ChinaMobile),中国联通(ChinaUnicom) 他们都属于网络运营商(NetworkOperator),

​		都有各自的网络类型(type),比如：

​			中国电信的网络类型为LTE,中国移动的网络类型为TD-LTE,中国联通的网络类型为WCDMA.

​		网络运营商都有安装宽带(installBroadband)和安装有线电视(installCableTV)的行为.

​		网络运营商都实现了上网(IInternet)和打电话(ICall)的功能,

​		此外,中国移动通过飞信实现了聊天(IChat)的功能.

要求：使用继承知识模拟各网络运营商的关系，使用接口实现功能关系。
 */
public class test3_2 {
    public static void main(String[] args) {
        NetworkOperator cm =new ChinaMobile();
        cm.setName("中国移动");
        cm.setType("TD-LTE");
        cm.installBroadband();
        cm.installCableTV();
        IChat i = (IChat) cm;
        i.chat();
        NetworkOperator ct =new ChinaTelecom();
        ct.setName("中国电信");
        ct.setType("LTE");
        IInternet i1 = (IInternet) ct;
        i1.internet();
        NetworkOperator cu =new ChinaUnicom();
        cu.setName("中国联通");
        cu.setType("WCDMA");
        ICall ic = (ICall) cu;
        ic.call();
    }
}
class NetworkOperator{
    String name;
    String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void installBroadband(){
        System.out.println(name+"安装宽带");
    }
    public void installCableTV(){
        System.out.println(name+"安装有限电视");
    }
}
class ChinaTelecom extends NetworkOperator implements IInternet,ICall{

    @Override
    public void internet() {
        System.out.println(name+"实现上网功能");
    }

    @Override
    public void call() {
        System.out.println(name+"实现了打电话功能");
    }
}
class ChinaMobile extends NetworkOperator implements IInternet,ICall,IChat{

    @Override
    public void internet() {
        System.out.println(name+"实现上网功能");
    }

    @Override
    public void call() {
        System.out.println(name+"实现了打电话功能");
    }

    @Override
    public void chat() {
        System.out.println(name+"实现聊天功能啦~");
    }
}
class ChinaUnicom extends NetworkOperator implements IInternet,ICall{

    @Override
    public void internet() {
        System.out.println(name+"实现上网功能");
    }

    @Override
    public void call() {
        System.out.println(name+"实现了打电话功能");
    }
}
interface IInternet{
    void internet();
}
interface ICall{
    void call();
}
interface IChat{
    void chat();
}
