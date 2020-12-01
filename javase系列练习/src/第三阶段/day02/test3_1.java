package 第三阶段.day02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

//给一个字符串
//
//"name=小红&age=17&salary=8000.00&hireDate=1991-07-03;name=小明&age=23&salary=10000.00&hireDate=1992-12-11;name=小白&age=18&salary=12000.00&hireDate=1996-01-09"
//
//请把字符串中的数据封装到 Employee 的对象中，
//
//类 Employee 有 name（String 类型）、age（int 类型）、salary（薪水是 BigDecimal 类型）、hireDate（入职日期是 Date 类型） 四个字段且符合 JavaBean 规范
//
//把三个创建的对象存放数组中，求出在 1996 年前入职的员工的的平均薪资。
public class test3_1 {
    public static void main(String[] args) throws ParseException {
        Employee[] es =new Employee[3];
        Employee ee;
        int count=0;
        int countPerson=0;
        BigDecimal sum = new BigDecimal("0");
        String msg="name=小红&age=17&salary=8000.00&hireDate=1991-07-03;" +
                "name=小明&age=23&salary=10000.00&hireDate=1992-12-11;" +
                "name=小白&age=18&salary=12000.00&hireDate=1996-01-09";
        String[] s1=msg.split(";");
        for (String s2:s1){
            ee=new Employee();
            String[] s3=s2.split("&");
            for (String s4:s3){
                if(s4.contains("name")){
                    int index=s4.indexOf("=")+1;
                    String name=s4.substring(index);
                    ee.setName(name);
                }
                if(s4.contains("age")){
                    int index=s4.indexOf("=")+1;
                    String ageStr=s4.substring(index);
                    int age = Integer.parseInt(ageStr);
                    ee.setAge(age);
                }
                if(s4.contains("salary")){
                    int index=s4.indexOf("=")+1;
                    String salaryStr=s4.substring(index);
                    BigDecimal salary = new BigDecimal(salaryStr);
                    ee.setSalary(salary);
                }
                if(s4.contains("hireDate")){
                    int index=s4.indexOf("=")+1;
                    String hireDateStr=s4.substring(index);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date d =sdf.parse(hireDateStr);
                    ee.setHireDate(d);
                }

            }
            es[count]=ee;
            count++;
        }
        System.out.println(Arrays.toString(es));
        for(Employee aka_e :es){
            Calendar c=Calendar.getInstance();
            c.setTime(aka_e.getHireDate());
            if(c.get(Calendar.YEAR)<1996){
               sum= sum.add(aka_e.getSalary());
                countPerson++;

            }
        }
        System.out.println("1996 年前入职的员工的总薪资为:"+sum);
        System.out.println(" 1996 年前入职的员工的的平均薪资为:"+sum.divide(new BigDecimal(countPerson),2, RoundingMode.HALF_UP));
    }
}
class Employee{
    private String name;
    private int age;
    private BigDecimal salary;
    private Date hireDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}