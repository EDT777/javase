package 第四阶段.异常处理机制;

public class TryCatchCatchDemo {
    public static void main(String[] args) {
        try {
            System.out.println(2/3);
            System.out.println(2/0);
        }catch (NumberFormatException e) {
            //处理数字格式化异常的代码
            e.printStackTrace();
        } catch (ArithmeticException e) {
            //处理算术异常的代码
            e.printStackTrace();
        } catch (Exception e) {
            //处理其他未知的异常
            e.printStackTrace();
        }
    }
}
