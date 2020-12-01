package 第四阶段.多线程;

//2、现有一百个快递待派发，定义快递类Expresses 作为公共资源类，定义快递员线程类Mailman ,请开启三个线程派发此100个快递，并打印哪个快递员派发了哪一个快递。最后打印出每个快递员派发了多少快递
public class test3_2 extends Thread {


    public static void main(String[] args) {
        Mailman m = new Mailman();
        Mailman m2 = new Mailman();
        Mailman m3 = new Mailman();
        m.setName("小A");
        m2.setName("小B");
        m3.setName("小C");
        m.start();
        m2.start();
        m3.start();

    }
}

class Express {
    private String name;
    private String address;

    Express() {

    }

    Express(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Express{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Mailman extends Thread {
    private int num = 0;
    private static obj o = new obj();
    private static Express[] es;

    static {
        es = new Express[100];
        for (int i = 0; i <= 99; i++) {
            es[i] = new Express("快递" + i + "号", "广东省东莞大道" + i + "号");
        }
    }

    public void run() {
        for (int i = 0; i <= 99; i++) {
            synchronized (o) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (es[i] != null ) {
                    System.out.println(super.getName() + "派送了" + es[i].toString() + "快递");
                    es[i] = null;
                    num++;
                }
            }

        }
        System.out.println(super.getName() + "一共派送了" + num + "次");
    }
}

class obj {
    obj() {

    }
}