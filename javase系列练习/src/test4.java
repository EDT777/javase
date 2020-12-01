public class test4 {
    //4、在教室中有100人,使用多线程模拟学生从前后门出去.
    //效果如下:需要考虑线程安全问题
    //前面走出一个学生
    //后门走出一个学生
    //后门走出一个学生
    //前面走出一个学生
    //最后统计前后门各走出了多少人. 例如  前门走出40名学生,后门走出60名学生.
    public static void main(String[] args) {
        xianCheng x = new xianCheng();
        x.setName("前门");
        xianCheng x2 = new xianCheng();
        x2.setName("后门");
        x.start();
        x2.start();

    }
}

class xianCheng extends Thread {
    o oo = new o();
    public  int num = 0;

    private static int count = 100;

    public void run() {
        for (int i = 1; i <= 100; i++) {

            synchronized (oo) {
                if (count > 0) {
                    System.out.println(super.getName() + "走出一个学生" + count--);
                    num++;

                }
            }
        }
        System.out.println(super.getName()+"走出了"+num);

    }
}

class o {

}