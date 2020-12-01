package 第二阶段.day03;
//需求：模拟在主板（MotherBoard）上安装鼠标（Mouse）、键盘（KeyBoard）等，比较没有规范和有规范的区别。
public class test5 {
    public static void main(String[] args) {

    }
}

//不规范以下
class Mouse {
    //鼠标工作的方法
    public void work1() {
        System.out.println("鼠标在移动");
    }
}
class Keyboard {
    //键盘工作的方法
    public void work2() {
        System.out.println("鼠标在移动");
    }
}
class MotherBoard {
    //在主板上安装鼠标对象
    public void plugin(Mouse m) {
        m.work1();	//调用鼠标工作的方法
    }
    //在主板上安装键盘对象
    public void plugin(Keyboard k) {
        k.work2();	//调用键盘工作的方法
    }
}

//以下是规范的
interface IUSB {
    //USB设备工作的方法
    void swapData();
}
class Mouse_2 implements IUSB{

    public void swapData() {
        System.out.println("鼠标在移动");
    }
}
class Keyboard_2 implements IUSB{

    public void swapData() {
        System.out.println("用键盘打字");
    }
}
class MotherBoard_2 {
    //IUSB类型可以接受实现类对象
    public void plugin(IUSB usb) {
        usb.swapData();
    }
}