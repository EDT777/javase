package 第四阶段.异常处理机制;
//​	现有三个自定义异常年龄低异常（**LowAgeException**）、年龄高异常(**HighAgeException**)、工资高异常（**HighSalaryException**）
//
//他们都是运行时异常，并且都在自己的构造器中调用了父类的构造器:
//
//​		public RuntimeException(String message);
//
//​		//public RuntimeException(String message, Throwable cause)(可以不用)
//
//编写一个员工类：
//
//1. 属性：
//   编号，姓名，年龄，工资，身份证号码，员工人数
//
//2. 构造器：
//   构造器：设置编号，年龄，姓名；
//
//   如果年龄小于18，抛出**LowAgeException**，如果年龄大于60抛出**HighAgeException**，如果姓名为null或为空字符串，抛出空指针异常。
//
//3. 方法
//   增加工资  addSalary(double addSalary)，声明抛出工资高异常，当增加的工资大于5000时，抛出此异常。
public class test2_1 {
    public static void main(String[] args) {
        Employee e1= new Employee(1,2,"小A");
        Employee e2= new Employee(2,222,"小B");
        System.out.println(e2.getCount());
        e1.addSalary(22);
        System.out.println(e1.getMoney());
        e1.addSalary(2222222);
    }
}
class LowAgeException extends RuntimeException{
    LowAgeException(){

    }

    LowAgeException(String msg){
        super(msg);
    }
}
class HighAgeException extends RuntimeException{
    HighAgeException(){

    }
    HighAgeException(String msg){
        super(msg);
    }
}
class HighSalaryException extends  RuntimeException{
    HighSalaryException(){

    }

    HighSalaryException(String msg){
        super(msg);
    }

}
class Employee{
    private int number;
    private String name;
    private int age;
    private double money;
   private   static int count;
    private String shenfenzheng;

    {
       count+= 1;
    }
    Employee(int number,int age,String name){
        if(age<18){
            throw new LowAgeException("年纪太小了");
        }else if(age>60){
            throw new HighAgeException("年纪太大了");
        }else {
            if (name==null||"".equals(name)){
                throw new NullPointerException("空指针异常");
            }else {
                this.number=number;
                this.age=age;
                this.name=name;
            }

        }

    }

   void addSalary(double addSalary){
        if (addSalary>5000){
            throw new HighSalaryException("工资高异常");
        }else {
            this.money +=addSalary;
        }

    }
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public  int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }
}