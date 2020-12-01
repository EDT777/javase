package 第四阶段.多线程;
//实现一个名为Person的类和它的子类Employee（普通员工），Manager（经理）是Employee的子类，设计一个方法addSalary作为涨工资，普通员工一次能涨10％，经理能涨20％。 **(方法覆盖)**
//
//具体要求如下：
//
//(1)Person类中的属性有：姓名name(String类型)，地址address(String类型)，定义该类的构造方法；
//
//(2)Employee类中的属性有：工号id(String型)，工资salary(double类型)，工龄(int型)，定义该类的构造方法；
//
//(3)Manager类中的属性有：级别level(String类型)定义该类的构造方法；
//
//(4)编写一个测试类，产生一个员工和一个经理给该员工和经理涨工资，并输出其具有的信息。
//
//
public class test2_2 {
    public static void main(String[] args) {
         Employee e =new Employee("1",100,12);
         e.addSalary();
         e.address="广东省东莞市";
         e.name="小A";
        System.out.println("员工涨工资后的价格为"+e.salary);
        Employee e2 =new Manager("2");
        e2.address="湖北省武汉市";
        e2.name="小B";
        e2.gongLing=2;
        e2.id="2";
        e2.salary=100;
        e2.addSalary();
        System.out.println("经理涨工资后的价格为:"+e2.salary);
        System.out.println(e);
        System.out.println(e2);
    }
}
class Person{
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {

    }
}

class Employee extends Person{
    String id ;
    double salary;
    int gongLing;

    void addSalary(){
        salary=salary+salary*0.1;
    }
    public Employee(String id, double salary, int gongLing) {
        super();
        this.id = id;
        this.salary = salary;
        this.gongLing = gongLing;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", gongLing=" + gongLing +
                '}';
    }
}
class Manager extends Employee{
    String level;

    void addSalary(){
        salary=salary+salary*0.2;
    }
    Manager(String level){
        super();
        this.level=level;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", gongLing=" + gongLing +
                ", level='" + level + '\'' +
                '}';
    }
}