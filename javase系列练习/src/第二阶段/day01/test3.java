package 第二阶段.day01;

public class test3 {
    public static void main(String[] args) {
        StudentDemo s = new StudentDemo("小豪",12);
        s.setName("小红");
        System.out.println(s.getName());
    }


}
class StudentDemo{
   private String name;
    private  int age;

    StudentDemo(String name,int age){
        this.name=name;
        this.age=age;
    }
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
}
